module com.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.quizapp to javafx.fxml;
    exports com.quizapp;
}
