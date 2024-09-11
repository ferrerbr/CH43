package org.generation.letras;

public class LetrasMain {
	public static void main(String[] args) {
		
		//instancias los objetos de las clases (letras y contados )
		Letras letras = new Letras();
		Contador contador =new Contador();
		//Aplicar metodos a cada instancia para poder utilizarlos
		letras.contexto("Escribe un texto para conocer el numero de vocales consonantes, números y simbolos que posee");
		
		String texto  = letras.leerEntrada();//Este lo utilizare en los metodos  de contabilizacion y seria mejor guardarla en una variable
		
		int totalVocales = contador.contarVocales(texto);//Esto lo utilizare para mostrarle  al usuario cuantas variables tiene su texto  y seria mejor guardarlo  en la variable
		System.out.println("Hay " + totalVocales + " vocales");
		
		int totalConsonantes = contador.contarConsonantes(texto);//Esto lo utilizare para mostrarle  al usuario cuantas variables tiene su texto  y seria mejor guardarlo  en la variable
		System.out.println("Hay " + totalConsonantes + " consonantes");// aqui imprimo  mi mensaje con Systen.out.printnl
		
		int totalNumeros = contador.contarNumeros(texto);//Esto lo utilizare para mostrarle  al usuario cuantas variables tiene su texto  y seria mejor guardarlo  en la variable
		letras.contexto("Hay " + totalNumeros + " numeros"); //aqui uso  el metodo contexto para imprimoir un mensale al usuario
		
		int totalSimbolos = contador.contarSimbolos(texto);//Esto lo utilizare para mostrarle  al usuario cuantas variables tiene su texto  y seria mejor guardarlo  en la variable
		letras.contexto("Hay " + totalSimbolos + " simbolos");
		
	}

}
