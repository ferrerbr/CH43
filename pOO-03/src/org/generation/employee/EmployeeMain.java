package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		//herencia indica que una supler clase le va aextender caracteriticas a una o varias clases

	}

}
