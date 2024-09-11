package org.generation.employee.manager;

import org.generation.employee.Employee;
import org.generation.employee.Trabajador;

//clase que me permita asignar metodods y atributos  especificos de un manager, pero a la 
//vez esta misma clase herede los atributos y metodos de la clase employee


//para que esta clase herede los metodos y atributos de una super clase Employee debe convertose  en una subclse que extiende de una superclse 
public class Manager extends Employee implements Trabajador{
	
	//tributos propios de un manager
	private  int colaboradores;
	private float bono;
	
		//constructor recibe todos los atributos de la clase herencia 

	
	public Manager(String nombre, String apellido, int edad, float salario, String puesto, int colaboradores,
			float bono) {
		super(nombre, apellido, edad, salario, puesto);
		this.colaboradores = colaboradores;
		this.bono = bono;
	}
	
	
	//metodos especificos de un manager
	
	public void supervisar() {
		System.out.println("¿como van?");
	}
	//este metodo se hereda de employee pero aplicamos la anulacion de metodos
	 @Override
	public void calcularSalario() {
		float salarioTotal = this.getSalario()+this.bono;
		
		System.out.println("El salario del Manager " + this.getNombre() +" " + "es de $" + salarioTotal);
		
	}

	
	//generando getter y setter

	public int getColaboradores() {
		return colaboradores;
	}


	public void setColaboradores(int colaboradores) {
		this.colaboradores = colaboradores;
	}


	public float getBono() {
		return bono;
	}


	public void setBono(float bono) {
	
		this.bono = bono;
	}

	//gnerando el metodo to string

	@Override
	public String toString() {
		return "Manager " + getNombre() + " " + getApellido() +" Edad: " + getEdad()  + " bono: " + bono + " Salario:" + getSalario();
	}
	


	
	
	
	
	
	
	

}
