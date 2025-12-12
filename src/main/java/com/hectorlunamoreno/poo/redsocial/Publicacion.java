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
	public Publicacion(String contenido) {
		this.contenido = contenido;
		this.hora = LocalTime.now();
		this.likes = 0;
	}


	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public LocalTime getHora() {
		
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	

	public void setLikes(int likes) {
		this.likes = likes;
	}







 public void show() {
	 System.out.println("Contenido: " + contenido);
     System.out.println("Hora: " + hora);
     System.out.println("Likes: " + likes );
 
 }

 
 
 public void giveLike() {

	 //Suma un me gusta a la publicacion
	 likes++;
	 
	 
 }


 public int verLikes() {
		return likes;
	}




}
	



