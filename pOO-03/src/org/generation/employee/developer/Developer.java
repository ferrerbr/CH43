package org.generation.employee.developer;

import org.generation.employee.Employee;
import org.generation.employee.Trabajador;

public class Developer extends Employee implements Trabajador{
	//existe clases tipo enum
	//atributos nivel(junior midle senior), lenguajes(java.js python, sql, cobol
	private NivelDominio nivel;
	private LenguajesProgramacion tipoLenguaje;
	
	
	public Developer(String nombre, String apellido, int edad, float salario, String puesto, NivelDominio nivel,
			LenguajesProgramacion tipoLenguaje) {
		super(nombre, apellido, edad, salario, puesto);
		this.nivel = nivel;
		this.tipoLenguaje = tipoLenguaje;
	}
	
	//metodos propios de developper
	@Override
	public void trabajar() {
		System.out.println("El " +this.getPuesto()+" "+this.nivel + " que trabaja con " +this.tipoLenguaje);
	}
	
	
	//metodos getters y setters

	public NivelDominio getNivel() {
		return nivel;
	}

	public void setNivel(NivelDominio nivel) {
		this.nivel = nivel;
	}

	public LenguajesProgramacion getTipoLenguaje() {
		return tipoLenguaje;
	}

	public void setTipoLenguaje(LenguajesProgramacion tipoLenguaje) {
		this.tipoLenguaje = tipoLenguaje;
	}
	
	
	//metodo to string

	@Override
	public String toString() {
		return  getNombre() + getApellido() + ", Edad: " + getEdad() +", Salario:"
				+ getSalario() + ", Puesto: " + getPuesto() + ", nivel=" + nivel
				+ ", tipoLenguaje :" + tipoLenguaje ;
	}
	
	
	
	
	
	
	
	

}
