/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DTO.SE140364_Employee;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Henry
 */
public class SE140364_customerTableModelEmployee extends AbstractTableModel {

    private String[] headeres;
    private int[] indexes;
    private Vector<SE140364_Employee> data;

    public Vector<SE140364_Employee> getList() {
        return data;
    }

    public SE140364_customerTableModelEmployee(String[] headeres, int[] indexes) {
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
        SE140364_Employee emp = data.get(rowIndex);
        switch (indexes[columnIndex]) {
            case 0:
                return emp.getCode();
            case 1:
                return emp.getName();
            case 2:
                return emp.getAddress();
            case 3:
                return emp.getSalary();
        }
        return null;
    }
}
