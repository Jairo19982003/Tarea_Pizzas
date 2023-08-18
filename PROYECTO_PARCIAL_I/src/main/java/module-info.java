module com.example.proyecto_parcial_i {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.proyecto_parcial_i to javafx.fxml;
    exports com.example.proyecto_parcial_i;
}