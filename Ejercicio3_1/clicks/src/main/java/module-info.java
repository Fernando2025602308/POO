module com.mycompany.clicks {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.clicks to javafx.fxml;
    exports com.mycompany.clicks;
}
