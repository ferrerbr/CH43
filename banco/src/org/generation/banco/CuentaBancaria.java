package org.generation.banco;

import org.generation.exception.FondosInsuficientesException;

//aqui vive mu objeto con atributos metodos

public class CuentaBancaria {
	
	//1- Atributos con modificador de acceso
	private Long idCuenta;
	private String propietario;
	private double saldo;
	
	
	//2_  que solo recibe id cuenta y propietario como parametro ya que el saldo inicial es de 0 
	//
	public CuentaBancaria(Long idCuenta, String propietario) {
		super();
		this.idCuenta = idCuenta;
		this.propietario = propietario;
	}
	
	//metodo constructor para clientes que ya tienen un saldo previo en su cuenta bancaria
	public CuentaBancaria(Long idCuenta,String propietario,double saldo) {
		this.idCuenta = idCuenta;
		this.propietario = propietario;
		this.saldo = saldo;
		
	}
	//3_ Metodos especificos  para las clase: ingresar dinero.consultar dinero, retirar dinero
	
	//--Ingresar dinero
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	//--Consultar Saldo
	public void consultar() {
		System.out.println("tu saldo es de $" + saldo);
	}
	
	//--Retirar dinero(Crear un excepcion :Fondos insuficientes
	
	//implemetar Fondos insufucuentes como exception
	//le digo al metodo  que implemente la exception  utilizando la parabra resevada throws
	public void retirar(double monto) throws FondosInsuficientesException {
		if(monto <= saldo) {
			saldo -= monto;
			
			
		}else {
			throw new FondosInsuficientesException(saldo);
			
		}
	}

	
	//4_getters y setters

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria = idCuenta:" + idCuenta + ", propietario: " + propietario + ", saldo:" + saldo;
	}
	
	
	
	
	

}
