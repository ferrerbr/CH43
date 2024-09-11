package org.generation.exception;

//clase de tipo exception para crear  mi exception que se usara en e metodo retirar


public class FondosInsuficientesException extends Exception {
	private static final long serialVersionUID = 1L;//id 1l por default
	
	//1_Atributo
	private  double fondos;
	
	//Constructor
	public FondosInsuficientesException (double fondos) {
		this.fondos = fondos;
	}
	
	//getters y setters
	
	public double getFondos() {
		return fondos;
	}
	public void setFondos(double fondos) {
		this.fondos = fondos;
	}
	
	
	
	

}
