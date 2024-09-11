package org.generation.excepciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterador {

	public static void main(String[] args) {
		//1_Ierar mediante el ciclo forEAach
		ArrayList<String> nombres =new ArrayList<String>();
		
		nombres.addAll(Arrays.asList("Mitzi", "jorge" , "Aparicio" , "Ricardo" , "Diego" , "Oscar" , "Salvador" , "Emilio" , "Felipe" , "Cris","Brandon" ));
		
		System.out.println(nombres);
		
		for(String nombre : nombres) {
			System.out.println(nombre);

			
		}
		
		
		
		//2_Iterar mediante interfase Iterator
		System.out.println("------Iterator--------");
		ArrayList<Double> salarios =new ArrayList<Double>();
		
		salarios.addAll(Arrays.asList(19000.0, 18000.0, 22000.0, 24000.0, 15500.0, 28700.0, 14000.0, 16254.0, 12540.0, 8000.0,20000.0));
		//Mandamos a llamar la interfaz Iterator y la importamos Posee la misma sintaxis  de una Colleccion , pero  no v a una intancia un nuevo objeto de Iterator
		
		Iterator<Double> iteradorSalarios =salarios.iterator();
		System.out.println(iteradorSalarios);
		
		//necesitamos  aplicar otros metodos  de Iterator(.hasNext() en un ciclo while para determinar si existen elementos en el ArrayList ()boolean y mostrar dichos elementos
		while(iteradorSalarios.hasNext()) { //mientras iterator tenga un elemento siguiente 
			double salario =iteradorSalarios.next();
			System.out.println(salario);

		}


		
		
		//3_Iterar mediente expresiones Lambda y metodo .forEach
		
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.addAll(Arrays.asList(22,24,25,27,56,32,21,40,25,26));
		
		//iterando sobre el arraList usando un medoto forEch y una exprexion Lambda como parametro donde cada elemeto se llama edad

		edades.forEach((edad)->{
			System.out.println(edad);

			
		});
		
	}

}
