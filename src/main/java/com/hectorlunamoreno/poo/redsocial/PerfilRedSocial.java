package com.hectorlunamoreno.poo.redsocial;

public class PerfilRedSocial {

		private String idAccount;
		
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

		private String idVisible;
		
		private String Biography;
		
		public PerfilRedSocial(String idAccount, String idVisible, String biography, String city, int followers,
				int posts, boolean activo, boolean verificado) {
			super();
			this.idAccount = idAccount;
			this.idVisible = idVisible;
			Biography = biography;
			City = city;
			this.followers = followers;
			Posts = posts;
			this.activo = activo;
			this.verificado = verificado;
		}

		private String City;
		
		private  int followers;
		
		
		private int Posts;
		
		private boolean activo;
		
		private boolean verificado;
		
		
		public void sumarSeguidores(int cantidadSeguidores) {
			if (0 < cantidadSeguidores) {
			followers += cantidadSeguidores;
			
			
			
			
			} else { 
				System.out.println("cantidad debe ser mas alta");
			}
			
			
		}
		
		
		
		public void cambiarEstadoPerfil ( boolean cambioDeEstado) {
			
		this.activo = cambioDeEstado;
		//cambio el atributo activo, al valor que recibe el metodo
		
		
		if (activo) {
			
			System.out.println("El perfil esta ahora mismo: Activo");
			
		} else {
			
			System.out.println("El perfil esta ahora mismo: Inactivo");
		}
		
		
		}
		
		
		public String activeAccount() {
			
			
		return activo ? "si" : "no";
		
		// condicion, primer valor true, segundo false
			
			
			
			
		}
		
		
		
		public void mostrarInformacion() {
			

			System.out.println("----- Datos del perfil -----" );
			System.out.println("ID de la cuenta" + idAccount);
			System.out.println();
			System.out.println();
			
		}
		
		
		
	

}
