module com.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires static lombok;

    opens com.quizapp to javafx.fxml;
    exports com.quizapp;
}
