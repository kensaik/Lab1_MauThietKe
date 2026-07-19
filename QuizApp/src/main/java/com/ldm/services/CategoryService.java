/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ldm.services;

import com.ldm.pojo.Category;
import com.ldm.utils.JdbcConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhlocal
 */
public class CategoryService {

    public List<Category> getCate() throws SQLException {
        //Mở kêts nối
        Connection conn = JdbcConnection.getInstance().connect();

        //Truy vấn
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM category");

        List<Category> cate = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");

            Category c = new Category(id, name);
            cate.add(c);
        }
        return cate;
    }
}
