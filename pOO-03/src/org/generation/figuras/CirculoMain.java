package org.generation.figuras;

public class CirculoMain {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(5d);
		Circulo circulo1 = new Circulo(10d);
		Circulo circulo2 = new Circulo(30d);
		
		System.out.println(circulo.calcularArea());
		System.out.println(circulo1.calcularArea());
		System.out.println(circulo2.calcularArea());

		
	}

}
