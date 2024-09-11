package org.generation.banco;

import org.generation.exception.FondosInsuficientesException;

public class Cajero {

	public static void main(String[] args) {
		// Instaciar un nuevo objeto
		CuentaBancaria cuentaDaniel = new CuentaBancaria(45682514865L , "Daniel Maldonado");
	
		System.out.println(cuentaDaniel);
		
		//depositar dinero
		cuentaDaniel.depositar(500);
		//consultar
		cuentaDaniel.consultar();
		//depositar mas dinero
		cuentaDaniel.depositar(3000);
		//consultar
		cuentaDaniel.consultar();//output:3500
		
		
		//retirar dinero necesito manejarlo cola exception (try-catch-finaly)
		try {
			//metodo de retiro
			cuentaDaniel.retirar(2000);
			System.out.println("retire 2000");

			
		}catch(FondosInsuficientesException e){
			System.out.println("\u001B[31mSaldo insuficiente. No manito, no se pudo\u001B[0m");
			
		}finally {
			cuentaDaniel.consultar();// output:1500

		}
		
		
		
		///Retirar mas dinerio del que dispongo
		try {
			//metodo de retiro
			cuentaDaniel.retirar(2000);
			System.out.println("retire 2000");

					
		}catch(FondosInsuficientesException e){
				System.out.println("\u001B[31mSaldo insuficiente. No manito, no se pudo\u001B[0m");
					
		}finally {
				cuentaDaniel.consultar();// output:1500

				}
		System.out.println();
	}

}
