package org.generation.threads;

public class Ejemplo {

	  private String name;

	  public Ejemplo(String name) {
	    this.name = name;
	  }

	  public void run() {
	    for (int i = 0; i < 20; i++) {
	      System.out.println(i + " " + getName());
	    }
	    System.out.println("Termina thread " + getName());
	  }

	  private String getName() {
	    return name;
	  }
	}