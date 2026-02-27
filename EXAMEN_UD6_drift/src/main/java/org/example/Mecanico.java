package org.example;

public class Mecanico extends Participante{
    private Piloto piloto;

    public Mecanico(String pais, String nombre, Piloto piloto) {
        super(pais, nombre);
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
