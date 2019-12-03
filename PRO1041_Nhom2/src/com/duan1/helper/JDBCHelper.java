/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Viet Anh
 */
public class JDBCHelper {

    private static String userName = "sa";
    private static String passWord = "1234";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=Quiz";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        Connection con = DriverManager.getConnection(url, userName, passWord);
        PreparedStatement ptsm = null;
        if (sql.trim().startsWith("{")) {
            ptsm = con.prepareCall(sql);
        } else {
            ptsm = con.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            ptsm.setObject(i + 1, args[i]);
        }
        return ptsm;
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement ptsm = prepareStatement(sql, args);
            try {
                ptsm.executeUpdate();
            } finally {
                ptsm.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement ptsm = prepareStatement(sql, args);
            return ptsm.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
