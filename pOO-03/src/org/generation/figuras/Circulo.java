package org.generation.figuras;

public class Circulo  extends Figura{
	
	//atributo
	private double radio;
	//constructor

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	//Metodos proppios o heredados(metodos abstractos

	@Override
	public double calcularArea() {
		//pi*r2
		double area = Math.PI *Math.pow(radio, 2);
		return area;
		
	}
	
	//getter y setters

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	

}
