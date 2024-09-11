package org.generation.loops;

import java.util.Scanner;

public class EjerciciosLoops {
	public static void main(String[] args) {
		// loops ,bucles
		
		// ejercicio 1
		Scanner scanner = new Scanner(System.in);
		
		 
		int edad;
		
		do {
			System.out.println("Ingresa tu edad \n puedes ingresar -1 para terminar el programa");
			edad = scanner.nextInt();
			if(edad > 70 &&  edad < 200) {
				System.out.println("la prima mensual sera de $500 \n\n");
			}else if(edad >= 50) {
				System.out.println("La prima mensual sera de $400 \n\n");
			} else if(edad >= 30) {
				System.out.println("La prima mensual sera de $250 \n\n");
			}else if(edad > 0 && edad <30) {
				System.out.println("La prima mensual sera de $100 \n\n");
			}else {
				System.out.println("Ingresa una edad valida \n\n");
			}
			
		}while(edad != -1 );
		System.out.println("El programa ha finalizado \n\n");
		
		
		
		
		
		
		//ejercicio 2
		int edad2;
		double ingresoMensual;
		float aumento;
		
		do {
			
			System.out.println("PROGRAMA PARA CALCULAR PRIMAS DE SEGURO--- \n Ingressa tu edad \\n puedes ingresar -1 para terminar el programa ");
			edad2 = scanner.nextInt();
			if(edad == -1) {
				break;
			}else {
				System.out.println(" coloca tu ingreso mensual ");
				ingresoMensual = scanner.nextInt();
				
			}
			
			
			
			if (ingresoMensual >= 300 ) {
				aumento = 0.1f;
			}else {
				aumento =0.05f;
			}
				
			
			if(edad2 > 70 &&  edad < 200) {
				System.out.println("la prima mensual sera de $500 \n felicidades tienes un aumento del " + aumento*100 + "%"+ "\n tu prima mensual sera de " + 500 *(1+aumento));
				
			}else if(edad2 >= 50) {
				System.out.println("la prima mensual sera de $400 \n felicidades tienes un aumento del " + aumento*100 + "%"+ "\n  tu prima mensual sera de " + 400 *(1+aumento));
			} else if(edad2 >= 30) {
				System.out.println("la prima mensual sera de $250 \n felicidades tienes un aumento del " + aumento*100 + "%"+ "\n  tu prima mensual sera de " + 250 *(1+aumento));
			}else if(edad2 > 0 && edad <30) {
				System.out.println("la prima mensual sera de $100 \n felicidades tienes un aumento del " + aumento*100 + "%"+ "\n  tu prima mensual sera de " + 100 *(1+aumento));
			}else {
				System.out.println("Ingresa una edad valida \n\n");
			}
			
		}while(true );
		
		
		System.out.println("El programa ha finalizado \n\n");
		
		
		//3
		
		/*
		String nombre ;
		String contrasenia;
		int opcion;
		

		
			
			
			
		while(true){
			System.out.println("Ingresa tu nombre de usuario");
			nombre = scanner.nextLine();
			
			if(nombre.equals("exit")) {
				System.out.println("el nombre fue capturado");
				
				break;
			}else {
				System.out.println("Ingresa tu constraseña");
				//contrasenia = scanner.nextLine();
			}
			
			
			

			
			
			while(true) {
				System.out.println("Selecciona una opción , por favor ingresa solo el numoero de la opción \n\n 1. Para consultar tu saldo \n 2. Para ingresar dinero \n 3. para retirar dinero \n 4. Para consultar sus ultimos movimientos \n 5. Para convertir divisas \n 6. para salir presionene 0 (cero)");
				opcion = scanner.nextInt();
				
				
				if(opcion == 1) {
					System.out.println(" Has seleccionado la opcion para consultar tu saldo \n\n");
				
				}else if(opcion == 2) {
					System.out.println("Has seleccionado la opcin para ingresar dinero \n\n");
					
				} else if(opcion == 3) {
					System.out.println("Has seleccionado la opcion para retirar dinero \n\n");
					
				} else if(opcion == 4) {
					System.out.println("Has seleccionado la opcion para  consultar tus ultimos movimientos \n\n");
					
				} else if(opcion == 5) {
					System.out.println("Has selecionado la opcion para convertir divisas \n\n");
					
				} else if(opcion == 0) {
					System.out.println("Has seleccinado la opcion para salir \n\n");
					break;
				}else {
					System.out.println("porfavor selecciona una opcion valida \n\n");
				}
			}
			
			
		}
	**/
				
				
			// Pedir al usuario que ingrese su nombre
        System.out.println("Por favor, ingresa tu nombre:");
        String nombre = scanner.nextLine(); // Leer la entrada del usuario

        // Saludar al usuario usando su nombre
        System.out.println("Hola, " + nombre + "! Bienvenido al programa.");

        // Cerrar el escáner para liberar recursos
       //scanner.close();	
		
		
		
		
				
				
				
*/
				


	}
}
