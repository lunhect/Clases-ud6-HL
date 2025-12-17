package com.hectorlunamoreno.poo.redsocial;

public class GeneradorPerfiles {
	 
	public static PerfilRedSocial testProfileGenerator(String userName) {
		return new PerfilRedSocial(userName, userName, "¡Hola a todos!", "Amsterdam");
	}
	
	public static PerfilRedSocial testPerfilTestGenerator(String username, int postsNumber) {
	    PerfilRedSocial p = testProfileGenerator(username);
	    for (int i = 1; i <= postsNumber; i++) {
	        p.crearPublicacion("Numero post " + i); 
	    }
	    return p;
	}
}











