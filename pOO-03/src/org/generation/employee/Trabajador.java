package org.generation.employee;

//las interfaces son contratos que  las clses deben cumplir, lo que significa que cualquier clase que implemente una interface debe proporcionar una implementacion para todos sus metodos

//Una interfaz  en java  es una coleccion de metodos abstractos y propiedades constantes

//las interfaces se deben inplementar en las clses en donde utilizaremos los metodos usando la palabra implement seguido del nombre de la interfaz. Tengo que anotar  cuales son las calses que se estan implementando seguido  del nombre de la interfaz Tengo que anotar cuales son las clases de la interfaz que se estan implementado(@override)

public interface Trabajador {
	
	void trabajar();
	void calcularSalario();

}
