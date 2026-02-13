module org.example.examen2eval_di_afm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.examen2eval_di_afm to javafx.fxml;
    exports org.example.examen2eval_di_afm;
}