package org.generation.ejercicio5;

public class Main {
	public static void main(String[] args) {
		
		// instanciamos nuestras clases 
		Estudiante brandon = new Estudiante("Brandon",26,95);
		Estudiante emilio = new Estudiante("Emilio",24,94);
		Estudiante aparicio = new Estudiante("Aparicio",27,59);
		
		// usamos nuestros metodos sobre los estudiante creados
		brandon.mostrarInformacion();
		brandon.esAprobado();
		
		emilio.esAprobado();
		
		aparicio.mostrarInformacion();
		aparicio.esAprobado();
		
		
	}
}
