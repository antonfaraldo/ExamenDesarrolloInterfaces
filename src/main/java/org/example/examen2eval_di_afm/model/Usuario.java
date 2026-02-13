package org.example.examen2eval_di_afm.model;

public class Usuario {
    private String username;
    private String password;
    private Enum admin;
    public Usuario() {}
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
