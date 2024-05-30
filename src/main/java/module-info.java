module com.codelab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.codelab6 to javafx.fxml;
    exports com.codelab6;
}