package org.generation.liveCoding;

public class FizzBuzz {
	
	
	
	
	
	
	public void numeros() {
		
		for(int i=1 ; i<=100; i++) { 
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.println("FizzBuzz");
				
			}else if(i % 5 == 0 ) {
				System.out.println("Buzz");
			}else if (i % 3 == 0){
				System.out.println("Fizz");
				
			}else {
				System.out.println(i);
			}
			
			
		}
		
	}
	

}
