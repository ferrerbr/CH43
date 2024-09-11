package org.generation.letras;

import java.util.Scanner;

//en letras vamos a crear metodos que sirven para interactuar con el usuario

public class Letras {
	//Definir Scanner para recibir informacion del usuario
	Scanner scanner = new Scanner(System.in);
	
	//Metodos para retornar el escaner y usarlo las veces que queramos
	public String leerEntrada(){
		return scanner.nextLine();
	}
	
	
	//Método para dar contexto al usuario
	public void contexto(String mensaje) {
		System.out.println(mensaje);
	}
	

}
