package org.generation.banco;

import org.generation.exception.FondosInsuficientesException;

public class ClientesAntiguos {
	public static void main(String[] args) {
		
		CuentaBancaria cuentaBrandon = new CuentaBancaria(555481575659L,"Brandon Perez",200d);
		
		
		cuentaBrandon.consultar();
		cuentaBrandon.depositar(2000);
		cuentaBrandon.consultar();
		try {
			cuentaBrandon.retirar(5000);
			cuentaBrandon.consultar();
		}catch(FondosInsuficientesException e){
			System.out.println("saldo insuficente");
		}

	}

}
