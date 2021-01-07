/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultis;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Henry
 */
public class SE140364_DBUltis implements Serializable {

//    public static Connection openConnection() throws Exception {
////        Connection cn = null;
////        try {
////            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
////            String url = "jdbc:sqlserver://localhost:1433;databaseName=WorkShop8";
////            cn = DriverManager.getConnection(url, "sa", "asd123AA");
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        return cn;
//        Class.forName("com.microsoft.sqlsever.jdbc.SQLServerDriver");
//        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=WorkShop8", "sa", "asd123AA");
//        return con;
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433; databaseName=SE140364_PE;"
            + "user=sa; password=asd123AA";

    public static Connection openConnection() throws Exception {
        Class.forName(driver);
        return DriverManager.getConnection(url);
    }

}
