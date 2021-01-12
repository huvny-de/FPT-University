/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Henry
 */
public class MyConnection implements Serializable {

    public static Connection getMyConnection() {
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Sinhvien", "sa", "asd123AA");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cn;
    }

}
