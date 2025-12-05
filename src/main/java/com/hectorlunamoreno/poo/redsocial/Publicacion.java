package com.hectorlunamoreno.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {

	private String contenido;

	private LocalTime hora;

	private int likes;

	/**
	 * @param contenido
	 * @param hora
	 * @param likes
	 */
	public Publicacion(String contenido, LocalTime hora, int likes) {
		this.contenido = contenido;
		this.hora = hora;
		this.likes = likes;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public LocalTime getHora() {
		this.hora =  LocalTime.now();
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}







 public void mostrar() {

 
 }
}
 
 
 




