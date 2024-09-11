package org.generation.excepciones;

//En esta clase escribire el metodo  para realizar  una division entre dos numeros  y el metodo para instanciar objetos(main

public class DivisionMain {
	//Metodo que nos permite dividir dos numeros
	
	public static double division(double num1, double num2) {
		return num1/num2;
	}
	
	public static int divisionEnteros(int num1, int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		System.out.println(division(50,10));
		System.out.println(division(50,0));
		System.out.println(division(0,10));
	
	//manejando excepciones
	try {
		int resultado = divisionEnteros(50,0);
		System.out.println("el resultado de la division es " + resultado);
		
	}catch(ArithmeticException e){
		System.out.println("\u001B[31mNo se ouede dividir entre cero\u001B[0m");
		
	}finally {
		System.out.println("\u001B[32mprogramafinalizado");
		
	};
	
	
}
}
