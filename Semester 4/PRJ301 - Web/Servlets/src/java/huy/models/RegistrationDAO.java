/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.models;

import huy.db.MyConnection;
import huy.dtos.RegistrationDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henry
 */
public class RegistrationDAO implements Serializable {

    private Connection cn = null;
    private PreparedStatement preStm = null;
    private ResultSet rs = null;

    public RegistrationDAO() {
    }

    private void closeConnection() {
        try {
            if (rs != null) {
                rs.close();
            }

            if (preStm != null) {
                preStm.close();
            }

            if (cn != null) {
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String checkLogin(String username, String password) {
        String role = "failed";

        try {
            String sql = "Select Role From Registration Where Username = ? and Password = ?";
            cn = MyConnection.getMyConnection();
            preStm = cn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            rs = preStm.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();

        }
        return role;
    }

    public List<RegistrationDTO> findByLikeName(String name) {
        List<RegistrationDTO> result = null;
        RegistrationDTO dto = null;
        String username, fullname, role;
        try {
            String sql = "SELECT Username, Fullname, Role FROM Registration WHERE Fullname LIKE ?";
            cn = MyConnection.getMyConnection();
            preStm = cn.prepareStatement(sql);
            preStm.setString(1, "%" + name + "%");
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                username = rs.getString("Username");
                fullname = rs.getString("Fullname");
                role = rs.getString("Role");
                dto = new RegistrationDTO(username, fullname, role);
                result.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return result;
    }
}
