package org.generation.colecciones;

import java.util.HashMap;
import java.util.Map;

public class HasMapsCollections {
	public static void main(String[] args) {
		/********      HASH MAPS    ********/
		
		//Almacaena  elementos en pares clave- valor  y de puede acceder  a ellos mediante index. no es ordenadoy no permite datos duplicados
		HashMap<Long ,String> estudiantes = new HashMap<Long ,String>();
		
		//agregar elementos en pare(.put)
		estudiantes.put(20240001L, "Daniel Maldonado");
		estudiantes.put(20240002L, "Josue Hernandez");
		estudiantes.put(20240003L, "Emily Memije");
		estudiantes.put(20240004L, "Cintia Odeth");
		estudiantes.put(20240004L, "Joel Herrera"); 
		estudiantes.put(20240006L, "Cersar Diaz");
		
		System.out.print(estudiantes);
		
		//recorrer un HashMap, vamos a implementar un metodo de la interfaz Map que de llama Entry(Map.Entry ) dentro de un cliclo for eac
		
		for (Map.Entry<Long, String> estudiante : estudiantes.entrySet()) {
			System.out.print("La matricula " + estudiante.getKey() + " ,Estudiante" + estudiante.getValue()+"\n");
			
		}
		
	}
	

}
