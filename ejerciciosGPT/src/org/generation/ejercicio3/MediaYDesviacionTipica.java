package org.generation.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaYDesviacionTipica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creamos un scanner
		
		// declaramos e inicalizamos nuestras variables
		Double numero =0.0;
		ArrayList<Double> lista= new ArrayList<Double>();
		Double sumatoria = 0.0;
		Double media =0.0;
		Double sumatoria2 = 0.0;
		Double desvT2 = 0.0;
		Double desvT = 0.0;

		
		do {
			
			System.out.println("Ingresa numero (introduce un numero negativo para terminar");
			   numero = sc.nextDouble();// hacemos la recoleccion de mis numeros
			   if(numero <0 ) {// evaluamos si desea terminar con el porgrama 
				   if( lista.size() == 0) {// evaluamos si no ha ingresado ningun dato 
					   System.out.println("No se puede calcular la media y el desviacion estandar sin datos");
					   break;
				   }
				   //recorremos nuestra lista para hacer una sumatoria 
				   for(Double elemento:lista) {
					   sumatoria +=elemento;
					   
					   
				   }
				   media = sumatoria/ lista.size(); // calculamos la media con la sumatoria dividida entre el total de elementos
				   
				   System.out.println("media="+ media);
				   
				   // recorremos nuestra lista para calcular la diferencia  entre el cada valor y  la media 
				   for(double elemento:lista) {
					   sumatoria2 += Math.pow(elemento-media,2);
					   
					   
					   
				   }
				   
				   desvT2 = sumatoria2/lista.size();
				   desvT =Math.sqrt(desvT2);
				   System.out.println("Desviacion tipica=" + desvT );
				   
				    
				   break;
			   }
			   lista.add(numero);
			  System.out.println(">>" + lista);
			
		} while (true);
		
		sc.close();
		
		 
		
		
		
		
	}

}
