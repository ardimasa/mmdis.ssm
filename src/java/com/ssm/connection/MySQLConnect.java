 
package com.ssm.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class MySQLConnect {
     public static Connection getConnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "abc123");//local
//        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.6:3306/mmdis_dev","mmdis_user", "mmdis@123");//bsp
//        Connection conn = DriverManager.getConnection("jdbc:mysql://202.129.173.68:3306/mmdis_dev","mmdis", "mmdis@123");//jlm
        Connection conn = DriverManager.getConnection("jdbc:mysql://202.129.173.68:3306/mmdis_dev?user=mmdis&password=mmdis@123&useUnicode=true&characterEncoding=UTF-8");//jlm
//        Connection conn = DriverManager.getConnection("jdbc:mysql://10.9.0.160:3306/mmdis_dev?user=mmdis&password=mmdis@123&useUnicode=true&characterEncoding=UTF-8");//jlm
         
        System.out.println("success");
        return conn;
    }
    
    public static void Close() {
        Connection conn = null;
        PreparedStatement ps = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) { /* ignored */}
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) { /* ignored */}
        }
        if (cs != null) {
            try {
                cs.close();
            } catch (SQLException e) { /* ignored */}
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) { /* ignored */}
        }
    }
}