package org.generation.ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Productos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int identificador; //id
		String nameProducto; // nombre del producto 
		HashMap<Integer ,String> productosId = new HashMap<Integer ,String>();
		
		
		
		 
		while(true) {

			
			//pedimos al usuario el ID
			System.out.println("Ingresa el Id del producto, (para finalizar el programa ingresa 0000");
			identificador = scanner.nextInt();
			
			scanner.nextLine(); 
			
			//si el ID concide con 0 el programa finalizara
			if (identificador  ==  0) {
				System.out.println("programa finalizado");
				
				break;
			}
			
			
			//pedimos al usuario el nombre del producto
			System.out.println("Ingresa el nombre del producto");
			nameProducto = scanner.nextLine();
			
			
			//colocamos los productos dentro de mi HashMap
			productosId.put(identificador, nameProducto);
			
			
			
			
			//pu
			System.out.println("Id capturado: " + identificador+ "  pertenerce al producto: " +nameProducto + "\n\n" );
			
		}
		
		for (Map.Entry<Integer, String> producto : productosId.entrySet()) {
			System.out.println("Id del producto es : " + producto.getKey() + "  ,Nombre del producto" + producto.getValue());
		}
		
		
		
		
	}

}
