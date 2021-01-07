/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.SE140364_Suppliers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import ui.SE140364_customerTableModelSuppliers;
import ultis.SE140364_DBUltis;

/**
 *
 * @author Henry
 */
public class SE140364_TblSuppliersDAO {

    private String[] headeres = {"SupCode", "SupName", "Address"};
    private int[] indexes = {0, 1, 2};
    private SE140364_customerTableModelSuppliers modelSup = new SE140364_customerTableModelSuppliers(headeres, indexes);
    private Vector<String> listSuppliersComboBox = new Vector();

    public SE140364_TblSuppliersDAO() {
        try {
            loadData();
            loadSuppliersComboBox();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadData() throws Exception {
        modelSup.getList().clear();
        Connection con = null;      //connect
        PreparedStatement ps = null;  //De lam gi
        ResultSet rs = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "SELECT * FROM tblSuppliers";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    SE140364_Suppliers sup = new SE140364_Suppliers(rs.getString("supCode"), 
                            rs.getString("supName"), rs.getString("address"), rs.getBoolean("collaborating"));
                    modelSup.getList().add(sup);
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

    public SE140364_customerTableModelSuppliers getModelSup() {
        return modelSup;
    }

    public Vector<String> loadSuppliersComboBox() throws Exception{
        listSuppliersComboBox.clear();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "SELECT supCode, supName FROM dbo.tblSuppliers";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    listSuppliersComboBox.add(rs.getString("supCode") + " - " + rs.getString("supName"));
                }
                return listSuppliersComboBox;
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
        return null;
        }
    
    public Vector<String> getListSuppliersComboBox(){
        return listSuppliersComboBox;
    }
    
    public String getSupNameComboBox(String supCode) {
        for (SE140364_Suppliers sup : modelSup.getList()) {
            if (sup.getSupCode().compareToIgnoreCase(supCode) == 0) {
                return sup.getSupName();
            }
        }
        return "";
    }
    
    public int Insert(SE140364_Suppliers sup) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "Insert tblSuppliers Values(?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, sup.getSupCode());
                ps.setString(2, sup.getSupName());
                ps.setString(3, sup.getAddress());
                ps.setBoolean(4, sup.isColloborating());
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
    
    public int Save(SE140364_Suppliers sup) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "UPDATE tblSuppliers SET supName =?, address = ?, collaborating = ? WHERE supCode = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, sup.getSupName());
                ps.setString(2, sup.getAddress());
                ps.setBoolean(3, sup.isColloborating());
                ps.setString(4, sup.getSupCode());
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
    
    public int Delete(SE140364_Suppliers sup) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "DELETE FROM dbo.tblSuppliers WHERE supCode = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, sup.getSupCode());
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
        public boolean validDateCodeSupplier(String supCode) {
            try {
                for (int i = 0; i < modelSup.getList().size(); i++) {
                    if (modelSup.getList().get(i).getSupCode().compareToIgnoreCase(supCode) == 0) {
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
            }
        
        public boolean validDate(String supCode, String supName, String address) {
            if (supCode.isEmpty() || supCode.length() > 10) {
                JOptionPane.showConfirmDialog(null, "Invalid Code Suppliers");
                return false;
                
            }
            if (supName.isEmpty() || supName.length() > 50) {
                JOptionPane.showConfirmDialog(null, "Invalid SupName");
                return false;
                
            }
            if (address.isEmpty() || address.length() > 50) {
                JOptionPane.showConfirmDialog(null, "Invalid Address");
                return false;
                
            }
            return true;
        }
        
    }
