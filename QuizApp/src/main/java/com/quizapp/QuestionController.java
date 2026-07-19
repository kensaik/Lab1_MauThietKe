/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.quizapp;

import com.ldm.pojo.Category;
import com.ldm.services.CategoryService;
import com.ldm.utils.JdbcConnection;
import java.net.URL;
import java.nio.channels.ConnectionPendingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Manhlocal
 */
public class QuestionController implements Initializable {

    @FXML
    private ComboBox<Category> cbCate;
    private static final CategoryService cateServices = new CategoryService();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.cbCate.setItems(FXCollections.observableList(cateServices.getCate()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
