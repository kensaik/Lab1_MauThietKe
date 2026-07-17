package com.quizapp;

import com.ldm.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        Scene scence = new Scene(new FXMLLoader(App.class.getResource("question.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scence);
        stage.setTitle("Quiz App");
        stage.show();
}
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");        

    }
    public void handleExam(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon...");        
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
