package org.example.examen2eval_di_afm.model;

import java.time.LocalDate;

public class Equipo {
    private String nombre;
    private boolean campeon;
    private LocalDate fechaFundacion;
    private String urlEscudo;

    public Equipo() {}
    public Equipo(String nombre, boolean campeon, LocalDate fechaFundacion, String urlEscudo) {
        this.nombre = nombre;
        this.campeon = campeon;
        this.fechaFundacion = fechaFundacion;
        this.urlEscudo = urlEscudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCampeon() {
        return campeon;
    }

    public void setCampeon(boolean campeon) {
        this.campeon = campeon;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getUrlEscudo() {
        return urlEscudo;
    }

    public void setUrlEscudo(String urlEscudo) {
        this.urlEscudo = urlEscudo;
    }
}
