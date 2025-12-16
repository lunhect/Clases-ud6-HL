package com.hectorlunamoreno.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Publicacion {

    private static final String FORMAT_DATE_TIME = "dd-MM-yyyy / HH:mm:ss";
    private String contenido;
    private LocalDateTime hora; // LocalDateTime para ser preciso
    private int likes;

    /**
     * Constructor: crea una publicación con contenido y hora actual.
     */
    public Publicacion(String contenido) {
        this.contenido = contenido;
        this.hora = LocalDateTime.now();
        this.likes = 0;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getHora() {
        // Devuelve la hora formateada como String
        return hora.format(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME));
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void show() {
        System.out.println("Contenido: " + contenido);
        System.out.println("Hora: " + getHora()); // formateado
        System.out.println("Likes: " + likes);
    }

    public void giveLike() {
        // Suma un me gusta a la publicación
        likes++;
    }

    public int verLikes() {
        return likes;
    }
}
