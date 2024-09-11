package org.generation.colecciones;

import java.util.Arrays;
import java.util.HashSet;

public class HasSetCollections {
	public static void main(String[] args) {
		
		/******   HAS SET   ********/
		
		//En los HasSet cada elemento es unico y no existen elemento dubplicados 
		HashSet<String> animales = new HashSet<String>();
		
		//agregar elemantos a el HashSet
		animales.addAll(Arrays.asList("Perro","Gato","Conejo","Caballo","Gallina","Perro"));
		System.out.println(animales);// no muestra los elemento duplicados
		
		
		//metodo que me sirve par sabeer si un elemento existe denmtro de un Set (.contains(value))
		System.out.println(animales.contains("Caballo"));
		
		//Tamaño del set
		System.out.println(animales.size());// outuput:5 NO CUENTA LOS RPETIDOS
		
		//elimar elementos(remuve("elemento"))
		animales.remove("Gato");
		System.out.println(animales);
		
		//limpiar mi hash set
		animales.clear();
		System.out.println(animales);

		
		
		
		
	}

}
