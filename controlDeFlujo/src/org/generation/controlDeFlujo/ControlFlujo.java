package org.generation.controlDeFlujo;

import java.util.Scanner;

public class ControlFlujo {
	public static void main(String[] args) {
	/*
	 * Scanner. Metodo de java que me permite solicitar a un usuario cualquier tipo de dato
	 * tenemos que importar la clave de Scanner es nuestra clase de instanciaar un nuevo objeto de scanner
	 * 
	 * 
	 * */
		
		//1. Instanciar un obnjeto de tipo Scanner
		Scanner scanner = new Scanner(System.in);
		
		//2. Darle contexto al usuario;
		System.out.println("ingresa tu nombre");
		
		//3. Guardar el objeto Scanner instanciado en un a variable , segun el tipo de datos que solivitamos
		String nombre = scanner.next();
		
		//4. imprimir el valor de una variable nombre 
		System.out.println("Tu nombre es " + nombre);
		
		// si quiero solicitar al usuario otra informacion, puede reutilizar el objeto del tipo Scaner
		System.out.println("Ingresa tu edad");
		
		int edad = scanner.nextInt();
		
		System.out.println("tu edad es de "+ edad + " años");
		
		//por buena practica debemos cerrar el scanener
		//scanner.close();
		
		
		
	/*
	 * Control de flujo. Sentancias condicionales
	 * if  else, else-if;
	 * 
	 * 
	 * determinar si un apersona es un bebe , un niño o un adulto
	 * 
	if  * */
		if(edad >= 18) {
			if (edad < 60) {
				System.out.println("es un adulto");

			}else {
				System.out.println("es un aadulto mayor");

			}
		}else if(edad > 12){
			System.out.println("es un adolecente");
			
		}else if(edad >= 3) {
			System.out.println("es un niño");
			
		}else {
			System.out.println("es un  bebe");
		}
	
		
		//switch ingresa un numero del 1-7 para determinar que dia de la semana  corresponde

		
		// -- switch. Ingresa un número del 1 al 7 para conocer a qué día de la semana corresponde
		System.out.println("Ingresa un número del 1 al 7 para conocer a qué día de la semana corresponde");
		int numeroDia = scanner.nextInt();
		
		switch (numeroDia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Número invalido");
				break;
		}
			
		
		
		
		
		
		
		//operador ternario tenemos que poner el tipo de dato de la salida del codigo
		
		int hora = 20;
		String operadorTernario = (hora <20) ? "buen dia" : "buenas noches ";
		System.out.println(operadorTernario);
		
		
		
		
		
		//scanner.close();
		


		

	}
	
	
	
	
	
}
