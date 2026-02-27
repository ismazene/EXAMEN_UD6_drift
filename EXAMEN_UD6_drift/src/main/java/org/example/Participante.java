package org.example;

public abstract class Participante {
    private String nombre;
    private String pais;

    public Participante(String pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
