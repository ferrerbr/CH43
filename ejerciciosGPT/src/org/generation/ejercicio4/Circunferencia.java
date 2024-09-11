package org.generation.ejercicio4;

public class Circunferencia {
	
	// declarar atributos
	
	private float radio;
	float diametro;
	double perimetro;
	double area;
	
	//Metodo constructor
	public Circunferencia( float radio) {
		this.radio = radio;
	}
	// metodos de comportamientos
	 public void diametro() {
		 diametro = radio*2;
		 System.out.println("El diametro de la circunferencia es " + diametro);
	 }
	 
	 public void perimetro() {
		 perimetro = Math.PI*diametro;
		 System.out.println("El perimetro de la circunfernecia es " + perimetro);
	 }
	 public void  area() {
		 area =Math.PI*(Math.pow(radio, 2));
		 System.out.println("El are de la circunferencia es " + area);
	 }
	
	
	//setter y getters
	
	// metodo to string
	  @Override
	  public String toString() {
		  return "La circunferencia de radio" + radio + ",  tiene un diametro de "+ diametro + ",    un perimetro de "+ perimetro + "  y un area de "+area; 
		  
	  }
	

}
