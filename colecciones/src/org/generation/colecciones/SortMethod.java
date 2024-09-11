package org.generation.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SortMethod {
	public static void main(String[] args) {
		
		/********* METODO SORT *******/
		
		// Permite ordenar los elementosde una coleccion 
		ArrayList<Integer> edades = new ArrayList<Integer>();
		
		edades.addAll(Arrays.asList(23,25,24,28,26,21,29,22,45,19,45));
		System.out.println(edades); //muestra los elemeto como se encuentran en mi lista 
		
		//Ordena elementos de coleccion tomando como referencia la tabla ASCII(Colections.sort(COLLECTION))
		Collections.sort(edades);
		System.out.println(edades); //muestra los elementos ordenados de menos a mayor 
		Collections.sort(edades);
		//no podemos controlar el ordenamiento de un HashSet
		
		Collections.sort(edades);
		Collections.reverse(edades);
		System.out.println(edades); //muestra los elementos ordenados de mayor  a menor



		
		
		
		// ----- No podemos ordenar un HashSet. Si queremos mostrar los elementos ordenados de un Set utilizamos TreeSet, que nos muestra los elementos ordenados y omite los repetidos
		TreeSet<Integer> salarios = new TreeSet<Integer>(); 
		
		salarios.addAll(Arrays.asList(12000, 14000, 29000, 14000, 22000));
		
		System.out.println(salarios); // Output: [12000, 14000, 22000, 29000

		
	}

}
