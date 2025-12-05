package com.hectorluna.vehiculos;


import java.util.Scanner;

public class TareaSimple {
	
	
	
	
	private static final Scanner New = null;
	private String titulo; //atributo
	boolean completado;
	

	private String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean isCompletado() {
		return completado;
	}


	public void setCompletado(boolean completado) {
		this.completado = completado;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}


	/**
	 * @param titulo
	 * @param completado
	 */
	public  TareaSimple(String titulo, boolean completado) { //constructor
		this.titulo = titulo;
		this.completado = completado;
	}



	public void mostrarTarea() {
		
		if (isCompletado()) {
	
			System.out.println("La Tarea ha sido completada");
			
		
		} else {
			
			System.out.println("La tarea no ha sido completada");
		}
		
		
		
		}
		
	
	
	public void cambiarEstado() {
		
		this.completado = !completado;
		  // if (this.completado){
		  		
		
	}
		
	




	
	
	
	
	
	
	
	

}
