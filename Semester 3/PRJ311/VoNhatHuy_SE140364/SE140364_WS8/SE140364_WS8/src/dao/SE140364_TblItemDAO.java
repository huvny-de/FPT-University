/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.SE140364_Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import ui.SE140364_CustomerTableModeItem;
import ultis.SE140364_DBUltis;

/**
 *
 * @author Henry
 */
public class SE140364_TblItemDAO {
    
    private String[] headeres = {"itemCode", "itemName", "Suppliers", "Unit", "Price", "Suppying"};
    private int[] indexes = {0, 1, 5, 2, 3, 4};
    private SE140364_CustomerTableModeItem modeItem = new SE140364_CustomerTableModeItem(headeres, indexes);
    
    public SE140364_CustomerTableModeItem getModeItem() {
        return modeItem;
    }
    
    public SE140364_TblItemDAO() {
        try {
            loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void loadData() throws Exception{
        modeItem.getList().clear();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "SELECT * FROM tblItems";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {                    
                    SE140364_Item it = new SE140364_Item(rs.getString("itemCode"), rs.getString("itemName"), rs.getString("unit")
                            , rs.getFloat("price"), rs.getBoolean("supplying"), rs.getString("supCode"));
                    modeItem.getList().add(it);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    public String loadSupCodeIntoItems(String Suppliers) {
        StringTokenizer stk = new StringTokenizer(Suppliers, " - ");
        return stk.nextToken();
    }
    
    public int Insert(SE140364_Item it) throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "INSERT tblItems VALUES(?,?,?,?,?,?)";
                StringTokenizer stk = new StringTokenizer(it.getSupCode(), " - ");
                
                ps = con.prepareStatement(sql);
                ps.setString(1, it.getItemCode());
                ps.setString(2, it.getItemName());
                ps.setString(3, it.getUnit());
                ps.setFloat(4, it.getPrice());
                ps.setBoolean(5, it.isSupplying());
                ps.setString(6, stk.nextToken());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return -1;
    }
    
    public int Save(SE140364_Item it) throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "UPDATE tblItems SET itemName = ?, unit = ?, price = ?, supplying = ?, supCode = ? WHERE itemCode = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, it.getItemName());
                ps.setString(2, it.getUnit());
                ps.setFloat(3, it.getPrice());
                ps.setBoolean(4, it.isSupplying());
                ps.setString(5, it.getSupCode());
                ps.setString(6, it.getItemCode());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return -1;
    }
    
    public int Delete(SE140364_Item it) throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "DELETE FROM tblItems WHERE itemCode = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, it.getItemCode());
                return ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return -1;
    }
    
    public boolean validDateCodeItem(String itemCode) {
        try {
            for (int i = 0; i < modeItem.getList().size(); i++) {
                if (modeItem.getList().get(i).getItemCode().compareToIgnoreCase(itemCode) == 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return true;
    }
    
    public boolean validDate(String itemCode, String itemName, String unit, String price, Object supCode) {
        if (!itemCode.toUpperCase().matches("E\\d{4}")) {
            JOptionPane.showConfirmDialog(null, "Invalid Code");
            return false;
        }
        
        if (itemName.isEmpty() || itemName.length() >= 50) {
            JOptionPane.showConfirmDialog(null, "Invalid Name");
            return false;
        }
        if (unit.isEmpty() || unit.length() >= 50) {
            JOptionPane.showConfirmDialog(null, "Invalid Unit");
            return false;
        }
        if (!price.matches("\\d+.?\\d*")) {
            JOptionPane.showConfirmDialog(null, "Invalid Price");
            return false;
        }
        if (supCode == null) {
            JOptionPane.showConfirmDialog(null, "Choose the SupCode");
            return false;
        }
        return true;
    }
    
    public boolean checkConstraintSupCode(String supCode){
        for (int i = 0; i < modeItem.getList().size(); i++) {
            if (supCode.compareToIgnoreCase(modeItem.getList().get(i).getSupCode()) == 0) {
                return false;
            }
        }
        return true;
    }
}
