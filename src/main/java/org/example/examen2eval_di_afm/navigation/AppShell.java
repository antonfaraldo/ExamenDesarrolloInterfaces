package org.example.examen2eval_di_afm.navigation;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.examen2eval_di_afm.model.Usuario;

import javax.swing.text.View;
import java.util.HashMap;

public class AppShell {
    private static AppShell  instance;
    private BorderPane  root;
    private Stage stage;

    HashMap<View, Object, Usuario>

    private AppShell() {}
    public static AppShell getInstance() {
        if (instance == null) {
            instance = new AppShell();
        }
        return instance;
    }

    public static void setInstance(AppShell instance) {
        AppShell.instance = instance;
    }

    public BorderPane getRoot() {
        return root;
    }

    public void setRoot(BorderPane root) {
        this.root = root;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Stage

}
