module org.example.examen2eval_di_afm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.j;


    opens org.example.examen2eval_di_afm to javafx.fxml;
    exports org.example.examen2eval_di_afm;
}