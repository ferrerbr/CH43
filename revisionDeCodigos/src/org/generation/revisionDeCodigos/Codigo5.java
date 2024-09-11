package org.generation.revisionDeCodigos;


////importamos el scanner
import java.util.Scanner;


public class Codigo5 {

	////Creeamos la clase pública main
	public static void main(String[] args) {
		 //Agregamos system in adentro del Scanner
		Scanner s = new Scanner(System.in);
		 //Cambiamos el tipo de coma
		System.out.println("Introduzca un número:");
		int ni = s.nextInt();
		// guardamos la variable para imprimirla después, sin que s cambie por las operaciones posteriores del código.
		int c = ni;
		//eliminamos el csteo de string a int , ya que la variable ni se recoge como int , y par el caso de C al momento de imprimirla en consola , es indiferente su tipo de datol
			    
		int afo = 0;
		int noAfo = 0;
		
		// Se hace un casteo para pasar de String a int la variable ni
		//cambiamos el while por un if 
		if (ni > 0) {
			int digito = (int)(ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
				  
				ni /= 10;
			}
			
			if (afo > noAfo) {
				System.out.println("El " + c + " es un número afortunado.");
			     
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			      
			}
			    
			   
		}
		//Cerramos el scanner
		s.close();
	}
}