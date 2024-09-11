package org.generation.ejercicio1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.println("ingresa un numero");
			 float numero1 =sc.nextFloat();
			 System.out.println("ingresa la operacion que deceas realizar + - * /");
			 String operacion =sc.next();
			 System.out.println("ingresa otro numero");
			 float numero2 =sc.nextFloat();
			 float resultado = 0;
			 
			  if(operacion.equals("+")) {
				  System.out.println("suma "+ numero1 + operacion +numero2);
				  resultado = numero1 + numero2;
				  System.out.println("resultado="+ resultado);
				  
			  }else if(operacion.equals("-")) {
				  System.out.println("resta "+ numero1 + operacion +numero2);
				  resultado = numero1 - numero2;
				  System.out.println("resultado="+ resultado);
				  
			  }else if(operacion.equals("/")) {
				  
				  if (numero2 != 0) {
					  System.out.println("división"+ numero1 + operacion +numero2);
					  resultado = numero1 / numero2;
					  System.out.println("resultado="+ resultado);
				  }else {
					  System.out.println("no se pueden dividor por cero");
				  }
				   
				  
			  }else if (operacion.equals("*")) {
				  System.out.println("multiplicacion"+ numero1 + operacion +numero2);
				  resultado = numero1 * numero2;
				  System.out.println("resultado="+ resultado);
				  
			  }
			   
			  System.out.println("¿Quieres realizar otra operación? (si/no):");
			  String masOperaciones = sc.next();
			   if(masOperaciones.equals("no")) {
				   break;
				   
			   }
			
		} while (true);
		
		
		
		
		 
		  
		 
		 
		 sc.close();
	
	}

}
