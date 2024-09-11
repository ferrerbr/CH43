package org.generation.employee.manager;

public class ManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager brandon = new Manager("Brandon","Perez",26,37000f,"Manager",12,12000f);
		
		
		System.out.println(brandon);
		
		//invocando metodos
		brandon.informacion(); // metodo de la superclse
		brandon.calcularSalario();//metodo que toma el metodo de la superclse y lo anula despues lo sobreescribe para retornar una 
		brandon.supervisar();
	}
	

}
