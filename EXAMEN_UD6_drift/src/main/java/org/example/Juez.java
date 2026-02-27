package org.example;

public class Juez extends Participante implements AccionesCarrera{

    public Juez(String pais, String nombre) {
        super(pais, nombre);
    }

    public void validarCocheApto(Piloto piloto){}

    @Override
    public void validarInscripciones(Inscripcion inscripcion) {

    }

    @Override
    public void darSalida() {

    }

    @Override
    public void puntuar(Piloto piloto) {

    }
}
