package com.hectorlunamoreno.poo.redsocial;

public class GeneradorPerfiles {
	 
	public static PerfilRedSocial testProfileGenerator(String userName) {
		return new PerfilRedSocial(userName, userName, "¡Hola a todos!", "Madrid");
	}
	
	public static PerfilRedSocial testProfilePostIncludedGenerator(String username, int postsNumber) {
		PerfilRedSocial p = testProfileGenerator(username);
		for (int i = 1; i <= postsNumber; i++) {
			p.newPost("Publicacion " + i);
		}
		return p;
	}
}