package org.generation.employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
	//instanciar nuevos objetos s partir de la clase Employee
		


		
		Employee daniel = new Employee("Daniel","Maldonado", 37 , 95363.22f ,"instructor");
		
		Employee salvador =new Employee("Salvador","Gonzales", 29 , 19422.87f ,"Desarollador fullstack");
		
		Employee moni = new Employee("Monica","Jasoo", 27 , 27245.23f ,"Fronteds Dev");
		
		Employee mitzi = new Employee("Mitzi","Martines", 26 , 26500.23f ,"MES Dev");
		
		Employee alberto = new Employee("Erick","montes de oca", 26 , 9688.23f ,"fullstack Dev");

		
		//imprimimos los objetos  por la notacion @override
		System.out.println("------------   Impresion de los objetos por la notacion override   ------------");
		System.out.println(daniel);
		
		System.out.println(salvador);

		System.out.println(moni);

		System.out.println(mitzi);

		System.out.println(alberto);
		
		//invocando los metodos 
		System.out.println("------------   Invocacion de metodos    ------------");
		
		alberto.trabajar();
		moni.informacion();
		mitzi.calcularSalario();

		//acceder a la informacion de los objetos(getters);
		System.out.println(salvador.getNombre() + " " + salvador.getApellido() + " trabaja como: " + salvador.getPuesto());
		
		// aqui hicimos la suma de salario en la variable obetenida pero no se guardo como parte de su atributo de objeto
		System.out.println(alberto.getNombre() + " " + salvador.getApellido() + " tiene un saladio base de $"+ alberto.getSalario() + "Pero se le dara un aumento de  de $2000.00 quedando su nuevo salario en  $" + (alberto.getSalario()+2000));
		System.out.println(alberto);
		
		//para modificar la informacion de los objetos
		//Setters
		System.out.println("------------   ultilizando setters   ------------");

		float nuevoSalarioA =alberto.getSalario()+2000;
		alberto.setSalario(nuevoSalarioA); //guardo el nuevo salario  como parametro del setter 
		//verificamos que la informacion se modifico mandando a llamar a nuestro objeto
		System.out.println(alberto);


	}
}
