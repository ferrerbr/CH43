package org.generation.employee.manager;

import org.generation.employee.Employee;

// Clase que me permita asignar atributos y métodos específicos de un Manager, pero a la vez esta misma clase herede los atributos y métodos de la clase Employee.
// Para que esta clase herede los atributos y métodos de Employee, debe convertirse en una subclase que "extiende" de una superclase
public class Manager extends Employee {
	// Atributos propios de una Manager
	private int colaboradores;
	private float bono;
	
	// Constructor. Recibe los atributos de la clase Employee
	public Manager(String nombre, String apellido, int edad, float salario, String puesto, int colaboradores,
			float bono) {
		super(nombre, apellido, edad, salario, puesto);
		this.colaboradores = colaboradores;
		this.bono = bono;
	}
	
	// Métodos específicos de un Manager
	public void supervisar() {
		System.out.println("¿Cómo van?");
	}
	
	// Mismo método que Employee pero aplicando Overriding (Anulación de Métodos)
	public void calcularSalario() {
		float salarioTotal = this.getSalario() + this.bono;
		System.out.println("El salario del Manager " + this.getNombre() + " " + this.getApellido() + " es de $" + salarioTotal);
	}
	
	// Getters y Setter
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

	@Override
	public String toString() {
		return "Manager = Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Edad: " + getEdad() + ", Salario: $" + getSalario() + ", Puesto: " + getPuesto() + ", Colaboradores: " + colaboradores + ", Bono: $" + bono;
		
	}

	
	
	
	
}
