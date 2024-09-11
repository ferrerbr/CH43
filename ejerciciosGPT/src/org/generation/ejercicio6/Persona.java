package org.generation.ejercicio6;

public class Persona {
	
	//propiedades
	private String nombre;
	private int edad;
	
	// metodo constructor 
	public Persona(String nombre, int edad) {
		this.nombre =nombre;
		this.edad =edad;
		
	}
	
	// metodos de comportamiento
	 public  void mostrarInformacion() {
		 System.out.println("El dueño " + nombre + ",  tiene "+ edad + " años.");
	 }
	
	//getters y setters
	public String getNombre() {
		return nombre;
		
	}
	public void setNombre( String nombre) {
		this.nombre =nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public  void setEdad(int edad) {
		this.edad =edad;
		
	}
	
	
	

}
