/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultis;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Henry
 */
public class SE140364_DBUltis implements Serializable {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433; databaseName=SE140364_PE;"
            + "user=sa; password=asd123AA";

    public static Connection openConnection() throws Exception {
        Class.forName(driver);
        return DriverManager.getConnection(url);
    }

}
