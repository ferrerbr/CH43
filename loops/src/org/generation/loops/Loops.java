package org.generation.loops;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		// loops ,bucles
		
		//crear un programa ára que realice un cuenta de 1 a n donde n es el numero que el usuario proporciona
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un nunmero final");
		
		
		//podemos inicalizar multiples variables del miosmo tipo en una sola liea
		int numInicial, numFinal;
		numInicial = 1;
		numFinal =scanner.nextInt();
		
		while(numInicial <= numFinal) {
			System.out.println(numInicial);
			numInicial++;
		}
		
		
		


// crear unn programa que soliciyte al usuario un numero entre 1 y 999 para determinar cuantos digitos posee dicho numnero 
//El programa  se ejecuta sin terminar el proceso  hasta que el usuario ingrese el numoer 0
		int numero;
		
		
		do {
			System.out.println("Ingresa un numero entre 1-999 \n al ingresar el valor de 0 se termina el programa ");
			numero = scanner.nextInt();
			
			if (numero >= 100 &&  numero < 1000) {
				System.out.println("el numero " + numero + " posee 3 digitos \n" );
				
			}else if(numero >= 10 && numero < 100) {
				System.out.println("el numero " + numero + " posee 2 digitos \n" );
				
			}else if(numero>0 && numero <10){
				System.out.println("el numero " + numero + " posee 1 digitos \n" );
			}else {
				System.out.println("tu numoero no entra dentro del rango \n" );
			}
			
		}while(numero != 0);
		
		System.out.println("el programa ah finalizado" );
		
		
		
		
		// 3. Determinar un cliente ganador
		for (int contador = 1; contador <= 10; contador++) {
		    //Sentencia continue
		    if (contador == 5) {
		        System.out.println("Cliente ganador");
		        continue;
		    }
		    System.out.println("Cliente número " + contador);
		}
		
		
		//4.Crear un programa que nos permita calcular el are de un circulo solicitando al usuario el valor del radio de la circunferencia
		
		System.out.println("ingresa el radio de la circunferencia para calcular el area de un circulo" );
		 double radio = scanner.nextDouble();
		 //Area = pi * radio2
		 double area = Math.PI * Math.pow(radio, 2);
			System.out.println("el area de la circunferencia es " + area );


		
	

	}

}
