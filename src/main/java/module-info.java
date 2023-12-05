module com.example.csc311_lamdas_streams {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_lambdas_streams to javafx.fxml;
    exports com.example.csc311_lambdas_streams;
}