package org.generation.colecciones;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollections {
	public static void main(String[] args) {
		
		/***********    ARAYS    ********/
		String [] nombres = {"Abram","Chris","Erick"};
		int[] edades = {23,28,23};
		
		//Para addedes a mis arrays debop usar un metodo de Arrays que nos permite convertit los elementos en string
		System.out.println(Arrays.toString(nombres));
		System.out.println(Arrays.toString(edades));
		
		//Acceder a un elemento del array
		String nombre1 =nombres[2];
		System.out.println(nombre1);
		
		//Longitud de un array
		System.out.println(edades.length);
		
		//Mostrar todos los elementos  del Array en forma de lista
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
		
		/***********   ARRAY LIST   ************/
		// El array puede cambiar de tamaño y que permite elementos duplicados
		List<Double> salarios = new ArrayList<>();//inicializado desde la interfase list recibiendo datos del tipo wrapper class
		ArrayList<String> peliculas = new ArrayList <String> ();//Inicalzando desde la clase Array list recibiendo datos del tipo wrapper class
		
		//Agregar valores  alos Array list(.add)
		salarios.add(40000.00d);
		salarios.add(50000.00d);
		salarios.add(20000.00d);
		
		//agregar valores a peliculas
		peliculas.add("La vida es bella");
		peliculas.add("Transformers");
		peliculas.add("Duro de matar");
		
		
		System.out.println(salarios);
		System.out.println(peliculas);
		
		
		//acceder a elementos especificos  del ArrayList(get.(index))
		double salarios2 = salarios.get(1);
		System.out.println(salarios2);
		
		
		//Modificar un elemento del ArrayList (.set (index, newValue))
		salarios.set(2, 4500000.00d);
		System.out.println(salarios);
		
		//agregar un elemento al final de mis lista
		salarios.add(111000.00d);
		
		//Acceder a el ultimo elemento de mis lista (.size()-1)
		double ultimoElemento = salarios.get(salarios.size()-1);
		System.out.println(ultimoElemento);
		
		//imprmiento los 4 elementos de salarios
		System.out.println(salarios);
		
		//Eliminar un elemento (.remuve.(index))
		salarios.remove(3);
		System.out.println(salarios);
		
		// recorrer unArrayList  y mostrar los elemetos como lista
		for (double salario : salarios ) {
			System.out.println("este es un salario "+ salario);
		}
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
