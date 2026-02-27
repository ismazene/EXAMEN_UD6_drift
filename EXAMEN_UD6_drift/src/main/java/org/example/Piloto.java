package org.example;

public class Piloto extends Participante {
    private String marca;
    private EstadoCoche estado;
    private int puntuacion;

    public Piloto(String marca) {
        super(DriftSpainSeriesApp.nombre, DriftSpainSeriesApp.pais);
        this.marca = marca;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EstadoCoche getEstado() {
        return estado;
    }

    public void setEstado(EstadoCoche estado) {
        this.estado = estado;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Inscripcion inscribirse(){
        return null;
    }

    @Override
    public String toString() {
        return marca;
    }
}
