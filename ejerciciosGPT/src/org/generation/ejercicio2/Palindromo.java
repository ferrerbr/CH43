package org.generation.ejercicio2;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		//pedimos al usuario  la pabra o frase a validar
		System.out.println("Introduce una frase o palabra ");  // pedimos al usuario que ingrese la palabra o cadena
		String cadena = sc.nextLine(); // guardamos el string ingresado por el usuario
		cadena =cadena.replaceAll(" ", ""); // quitamos todos los espaciados y convertimos la cadena a miusculas 
		cadena =cadena.replaceAll(".", "");// eliminamos los signos de puntuacion 
		cadena =cadena.replaceAll(",", "").toLowerCase(); //convertimos toda nuestra cadena a minusculas
		StringBuilder cadenaB =new StringBuilder(cadena);
		String cadenaR = cadenaB.reverse().toString();
		if(cadena.equals(cadenaR)) {
		System.out.println("tu texto es un palindromo");// mandamos a imprimir la cadena
		}else {
			System.out.println("Tu texto no es un palindromo");
		}
		sc.close();

	}

}
