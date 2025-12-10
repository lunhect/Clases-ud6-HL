package com.hectorlunamoreno.poo.redsocial;

public class PerfilRedSocial {

	// ATRIBUTOS

	private String idAccount;

	private String idVisible;

	private String Biography;

	private String City;

	private int followers;

	private int Posts;

	private boolean activo;

	private boolean verificado;

	private Perfil estado;

	// CONSTRUCTOR

	public PerfilRedSocial(String idAccount, String idVisible, String biography, String city,  
			boolean activo ) {
		super();
		this.idAccount = idAccount;
		this.idVisible = idVisible;
		Biography = biography;
		City = city;
		this.followers = 0;
		Posts =  0;
		this.activo = activo;
		this.verificado = false;
		this.estado = Perfil.COMPLETADO;
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
		return Biography;
	}

	public void setBiography(String biography) {
		Biography = biography;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getPosts() {
		return Posts;
	}

	public void setPosts(int posts) {
		Posts = posts;
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
	
	
	

	
	
	

	public void mostrarInformacion() {

		System.out.println("----- Datos del perfil -----");
		System.out.println("ID de la cuenta" + getIdAccount());
		System.out.println("Cantidad de Followers" + getFollowers());
		System.out.println("Status of profile"+ getEstado());
	}

}
