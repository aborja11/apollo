module com.aborja11.apollo {
    requires javafx.controls;
    requires javafx.fxml;
            
                requires net.synedra.validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens com.aborja11.apollo to javafx.fxml;
    exports com.aborja11.apollo;
}