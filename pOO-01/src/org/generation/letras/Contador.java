package org.generation.letras;

//aqui vive la logica para contar las vocales consonantes, numeros y simbolos
//grupo 1 ->Metodos booleanos para determinar si la entrada del usiario tiene  o no  los tipos de caracteres
//grupo 2 -> metodos  int para realizar el conteo  de cada tipo de caracter

public class Contador {
	//------ Grupo 1 -----
	//vocales
	public boolean esVocal(char caracter) {
		
		
		return(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' ) ;
	}
	
	//Consonante
	public boolean esConsonante(char caracter) {
		//casteo para utilizar los valores de la tabla ASCCI
		short codigoAscci =(short) caracter;
		return ((codigoAscci >= 65 && codigoAscci <= 90 )||(codigoAscci >=97 && codigoAscci <= 122) && !esVocal(caracter));
	}
	
	//numeros
	public boolean esNumero(char caracter) {
		//casteo para utilizar los valores de la tabla ASCCI
		short codigoAscci2 =(short) caracter;
		return (codigoAscci2 >= 48 && codigoAscci2 <= 57 );
	}
	
	//simbolos
	public boolean esSimbolo (char caracter) {
		return (!(esVocal(caracter) || esConsonante(caracter) || esNumero(caracter)));
	}
	
	//-------Grupo 2-----
	//vocales
	public int contarVocales(String texto) {
		int vocales = 0;
		for(char caracter : texto.toCharArray()) {
			if (esVocal(caracter)) {
				vocales++;
			}
		}
		return vocales;
	}
	
	//consonantes
	public int contarConsonantes(String texto) {
		int consonantes = 0;
		for(char caracter : texto.toCharArray()) {
			if (esConsonante(caracter)) {
				consonantes++;
			}
		}
		return consonantes;
	}
	
	//numeros
	public int contarNumeros(String texto) {
		int numeros = 0;
		for(char caracter : texto.toCharArray()) {
			if (esNumero(caracter)) {
				numeros++;
			}
		}
		return numeros;
	}
	
	//simbolos
	public int contarSimbolos(String texto) {
		int simbolos = 0;
		for(char caracter : texto.toCharArray()) {
			if (esSimbolo(caracter)) {
				simbolos++;
			}
		}
		return simbolos;
	}
	
	
	

}
