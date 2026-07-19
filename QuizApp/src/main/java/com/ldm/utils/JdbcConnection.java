/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ldm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manhlocal
 */
public class JdbcConnection {
    private static JdbcConnection instance;
    private static Connection conn;
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }   

    }
    public JdbcConnection() throws SQLException{
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "Hxjdjdn863");
    }
    public static JdbcConnection getInstance() throws SQLException{
        if(instance == null){
            instance = new JdbcConnection();
        }
         return instance;
    }
    public Connection connect(){
        return this.conn;
    }
    
    public void close() throws SQLException{
        if(conn != null)
            this.conn.close();
    }
}
