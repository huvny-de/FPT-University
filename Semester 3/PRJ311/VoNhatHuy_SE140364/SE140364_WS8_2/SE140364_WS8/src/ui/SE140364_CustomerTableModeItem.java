/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.SE140364_TblSuppliersDAO;
import dto.SE140364_Item;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Henry
 */
public class SE140364_CustomerTableModeItem extends AbstractTableModel{
    private String[] headeres;
    private int[] indexes;
    private Vector<SE140364_Item> data;
    SE140364_TblSuppliersDAO dao = new SE140364_TblSuppliersDAO();
    
    public void loadSuppliersComboBox(){
        try {
            dao.loadSuppliersComboBox();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getSuppliers(String supCode) {
        for (String sup : dao.getListSuppliersComboBox()) {
            if (sup.contains(supCode)) {
                return sup;
            }
        }
        return "";
    }
    
    public Vector<SE140364_Item> getList() {
        return data;
    }
    
    public SE140364_CustomerTableModeItem(String[] headeres, int[] indexes) {
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
    
    
    public String getComnName(int column) {
        if (column >= 0 || column < headeres.length) {
            return headeres[column];
            
        } else return "";
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
        SE140364_Item it = data.get(rowIndex);
        
        switch(indexes[columnIndex]) {
            case 0: return it.getItemCode();
            case 1: return it.getItemName();
            case 2: return it.getUnit();
            case 3: return it.getPrice();
            case 4: return it.isSupplying();
            case 5: return getSuppliers(it.getSupCode());
        }
        return null;
    }
}
