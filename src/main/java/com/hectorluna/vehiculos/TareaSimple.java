package com.hectorluna.vehiculos;

public class TareaSimple {
    private String titulo;
    private boolean completada;

    // Constructor
    public TareaSimple(String titulo, boolean completada) {
        this.titulo = titulo;
        this.completada = completada;
    }

    // Getter y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
    
  