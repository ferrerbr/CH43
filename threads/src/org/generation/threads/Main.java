package org.generation.threads;

public class Main {

	  public static void main(String[] args) {

	    Ejemplo ejemplo1 = new Ejemplo("Carlos");
	    Ejemplo ejemplo2 = new Ejemplo("Eduardo");
	    ejemplo1.run();
	    ejemplo2.run();
	    System.out.println("Termina thread main");
	    
	    System.out.println("*********************");

	    // Crea dos objetos de la clase ThreadEjemplo
	    // e inicia ambos hilos
	 // Ejemplos con hilos
        ThreadEjemplo hilo1 = new ThreadEjemplo("hilo carlos");
        ThreadEjemplo hilo2 = new ThreadEjemplo("hilo eduardo");

        // Iniciar hilos
        hilo1.start();
        hilo2.start();
	    
	  }

	}