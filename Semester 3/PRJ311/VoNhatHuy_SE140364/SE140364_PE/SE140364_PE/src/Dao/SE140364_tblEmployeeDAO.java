/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DTO.SE140364_Employee;
import UI.SE140364_customerTableModelEmployee;
import Ultis.SE140364_DBUltis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Henry
 */
public class SE140364_tblEmployeeDAO {

    private String[] headeres = {"Code", "Name", "Address", "Salary"};
    private int[] indexes = {0, 1, 2, 3};
    private SE140364_customerTableModelEmployee modelEmp = new SE140364_customerTableModelEmployee(headeres, indexes);

    public SE140364_tblEmployeeDAO() {
        try {
            loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadData() throws Exception {
        modelEmp.getList().clear();
        Connection con = null;      //connect
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "SELECT * FROM tbl_Employee";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    SE140364_Employee emp = new SE140364_Employee(rs.getString("Code"), rs.getString("Name"), rs.getString("Address"), rs.getInt("Salary"));
                    modelEmp.getList().add(emp);
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

    public SE140364_customerTableModelEmployee getModelEmp() {
        return modelEmp;
    }

    public int Insert(SE140364_Employee emp) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "Insert tbl_Employee Values(?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, emp.getCode());
                ps.setString(2, emp.getName());
                ps.setString(3, emp.getAddress());
                ps.setInt(4, emp.getSalary());
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

    public int Save(SE140364_Employee emp) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "UPDATE tbl_Employee SET Name =?, Address = ?, Salary = ? WHERE Code = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, emp.getName());
                ps.setString(2, emp.getAddress());
                ps.setInt(3, emp.getSalary());
                ps.setString(4, emp.getCode());
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

    public int Delete(SE140364_Employee emp) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SE140364_DBUltis.openConnection();
            if (con != null) {
                String sql = "DELETE FROM dbo.tbl_Employee WHERE Code = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, emp.getCode());
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

    public boolean validDateCodeEmployee(String Code) {
        try {
            for (int i = 0; i < modelEmp.getList().size(); i++) {
                if (modelEmp.getList().get(i).getCode().compareToIgnoreCase(Code) == 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean validDate(String Code, String Name, String address) {
        if (Code.isEmpty() || Code.length() > 10) {
            JOptionPane.showConfirmDialog(null, "Invalid Employee Code");
            return false;

        }
        if (Name.isEmpty() || Name.length() > 50) {
            JOptionPane.showConfirmDialog(null, "Invalid Name");
            return false;

        }
        if (address.isEmpty() || address.length() > 50) {
            JOptionPane.showConfirmDialog(null, "Invalid Address");
            return false;

        }
        return true;
    }

}
