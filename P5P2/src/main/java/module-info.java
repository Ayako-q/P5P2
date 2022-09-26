module com.example.p5p2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p5p2 to javafx.fxml;
    exports com.example.p5p2;
}