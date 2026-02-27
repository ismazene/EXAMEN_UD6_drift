package org.example;

public class Inscripcion {
    private Piloto piloto;
    private CategoriaDrift categoria;
    private boolean pagado;

    public Inscripcion(Piloto piloto, CategoriaDrift categoria, boolean pagado) {
        this.piloto = piloto;
        this.categoria = categoria;
        this.pagado = false;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public CategoriaDrift getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDrift categoria) {
        this.categoria = categoria;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
