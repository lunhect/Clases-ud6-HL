package com.hectorlunamoreno.poo.redsocial;

import java.util.ArrayList;
import java.util.List;

public class PerfilRedSocial<listaPublicaciones> {

	// ATRIBUTOS

	private String idAccount;

	private String idVisible;

	private String biography;

	private String city;

	private int followers;
	private boolean activo;

	private boolean verificado;

	private Perfil estado;

	private  List<Publicacion> listaPublicaciones;
	
	
	// CONSTRUCTOR

	public PerfilRedSocial(String idAccount, String idVisible, String biography, String city,  
			boolean activo ) {
		super();
		this.idAccount = idAccount;
		this.idVisible = idVisible;
		this.biography = biography;
		this.city = city;
		this.followers = 0;
		this.activo = activo;
		this.verificado = false;
		this.estado = Perfil.COMPLETADO;
		this.listaPublicaciones = new ArrayList<>();
		
		
	}

	// GETTERS & SETTERS

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public String getIdVisible() {
		return idVisible;
	}

	public void setIdVisible(String idVisible) {
		this.idVisible = idVisible;
	}

	public String getBiography() {
		return this.biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getPosts() {
		return this.listaPublicaciones.size();
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

	public void sumarSeguidores(int cantidadSeguidores) {
		if (0 < cantidadSeguidores) {
			followers += cantidadSeguidores;

		} else {
			System.out.println("cantidad debe ser mas alta");
			
			//
			// sumarSeguidores(cantidadSeguidores);
		}

	}

	public Perfil getEstado() {
		return estado;
	}

	public void setEstado(Perfil estado) {
		this.estado = estado;
	}

 
	public void cambiarEstado(Perfil nuevoEstado) {

	 this.estado = nuevoEstado; 
	 
	 
	 //this sirve para modificar el atributo

	}
	
	
	
	public Perfil activeProfile() {
		
		return estado;
		
	
	}
	
	public void crearPublicacion(String texto) {
		
		this.listaPublicaciones.add(new Publicacion(texto));  //guarda un valor en la ultima posicion de la lista.

		
	
		
	}
	
	public void mostrarPublicaciones() {
		
		System.out.println(listaPublicaciones);
		
		
		
	}
	
	
	
         
	 
	
	
	

	public void mostrarInformacion() {

		System.out.println("----- Datos del perfil -----");
		System.out.println("ID de la cuenta" + getIdAccount());
		System.out.println("Cantidad de Followers" + getFollowers());
		System.out.println("Status of profile"+ getEstado());
	}

}
