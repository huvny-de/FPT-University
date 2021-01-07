/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dto.SE140364_Suppliers;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Henry
 */
public class SE140364_customerTableModelSuppliers extends AbstractTableModel {

    private String[] headeres;
    private int[] indexes;
    private Vector<SE140364_Suppliers> data;

    public Vector<SE140364_Suppliers> getList() {
        return data;
    }

    public SE140364_customerTableModelSuppliers(String[] headeres, int[] indexes) {
        this.headeres = new String[headeres.length];
        for (int i = 0; i < headeres.length; i++) {
            this.headeres[i] = headeres[i];
        }
        this.indexes = new int[indexes.length];
        for (int i = 0; i < indexes.length; i++) {
            this.indexes[i] = indexes[i];
        }
        data = new Vector<>();
    }

    //tai sao override, getColumnName cua ai
    //hoi thay lai thu tu thuc hien ws8
    public String getColumnName(int column) {
        if (column >= 0 || column < headeres.length) {
            return headeres[column];

        } else {
            return "";
        }
    }

    public int getRowCount() {
        return data.size();

    }

    public int getColumnCount() {
        return headeres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex >= data.size() || columnIndex < 0 || columnIndex >= headeres.length) {
            return null;
        }
        SE140364_Suppliers sup = data.get(rowIndex);
        switch (indexes[columnIndex]) {
            case 0:
                return sup.getSupCode();
            case 1:
                return sup.getSupName();
            case 2:
                return sup.getAddress();
            case 3:
                return sup.isColloborating();
        }
        return null;
    }
}
