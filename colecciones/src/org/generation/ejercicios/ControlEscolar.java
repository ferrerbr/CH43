package org.generation.ejercicios;

import java.util.Scanner;


public class ControlEscolar {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);{
    Scanner scanner1 = new Scanner(System.in);
    int t = scanner1.nextInt();  // Número de casos de prueba
    
    while (t-- > 0) {
        String input = scanner1.next();
        try {
            long number = Long.parseLong(input); // Convierte la entrada a long para comprobar
            
            System.out.println(input + " can be fitted in:");
            
            // Comprobar cada tipo, comenzando del más pequeño al más grande
            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
            
        } catch (NumberFormatException e) {
            System.out.println(input + " can't be fitted anywhere.");
        }
    }
    
    scanner1.close();
        }
        
        
    }
}