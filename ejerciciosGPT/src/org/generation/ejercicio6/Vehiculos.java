package org.generation.ejercicio6;

public class Vehiculos {
	private String marca;
	private String modelo;
	private int anio;
	private Persona dueno;
	
	// metodo constructor
	public Vehiculos(String marca,String modelo,int anio,Persona dueno) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.dueno = dueno;
	}
	
	// metodos de comportamiento
	public void mostrarInformacion() {
		System.out.println("Marca:" + marca +", Modelo "+ modelo + ", Año "+ anio );
		dueno.mostrarInformacion();
	}
	
	//getters y setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Persona getDueno() {
		return dueno;
	}

	public void setDueno(Persona dueno) {
		this.dueno = dueno;
	}
	
	

}
