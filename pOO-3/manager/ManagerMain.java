package org.generation.employee.manager;

import org.generation.employee.Employee;

public class ManagerMain {

	public static void main(String[] args) {
		Manager andrea = new Manager("Andrea", "Rojas", 28, 50000f, "Manager", 9, 2500f);
		Manager alan = new Manager("Alan", "Pacheco", 29, 50000f, "Manager", 9, 5000f);
		Manager roberto = new Manager("Roberto", "Venegas", 27, 35000f, "Manager", 9, 12000f);
		Manager salvador = new Manager("Salavador", "Gonzalez", 29, 40000f, "Manager", 6, 8000f);
		Employee david = new Employee("David", "Hernandez", 25, 20000f, "Backend Dev");

		System.out.println(roberto);
		
		// Invocando métodos
		andrea.informacion(); //Método de la superclass
		alan.calcularSalario(); // Anula el método de la superclass y ejecuta el método de la subclass
		salvador.supervisar();
		david.calcularSalario();
		
	}

}
