package org.example.examen2eval_di_afm.navigation;

public enum AppView {
    LOGIN("/fxml/login.fxml");

    private String path;

    AppView(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

}
