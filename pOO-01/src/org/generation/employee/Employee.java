package org.generation.employee;
//Esta clse es la plantilla de mi objeto que recibe atributos(variables de instancia) y comportamientos(metodos del objeto
//tambien va a recibir  metodos constructores metodos de accesibilidad (getters y setters) y metodos de conversion
public class Employee {
	//1.declarar atributos(variables de instancia)
	String nombre;
	String apellido;
	int edad;
	float salario;
	String puesto;
	//2. Método constructor, recibe el mismo nomnbre que la clase, no retona algo 
	//recibe como argumentos o parametros  a los atributos de objeto(o no )y estos se guardan con la palabra reservada this.
	//atajo para crear el metodo constructos  :click derecho >> Sourse >> Generate Constructor udung Fields >> Generate 
	public Employee(String nombre, String apellidoa, int edad, float salario, String puesto) {
		this.nombre = nombre;
		this.apellido = apellidoa;
		this.edad = edad;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	//metodos de comportamiento

	
	public void trabajar() {
		System.out.println("Estoy trabajando");
		
	}
	
	public void calcularSalario() {
		System.out.println("El salario es de $" + this.salario);
		
	}
	
	public void informacion() {
		System.out.println("Nombre: " + this.nombre + "  Apellido: " + this.apellido + "  Edad: " + this.edad + "  Puesto: " + this.puesto);
			
	}
	
	
	//4. Metodos de accesibilidad a la informacion de los atributos del objeto (getters y setters)
		//atajo para getters y setters: click derecho >> Sourse >> Generate getters and setters >> Generate 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	//5. metodo de conversion a string(to string) nos permite convertir la informacion  de los objetos en string
	//incluye la anotacion @override
	//atajo para crear metodo toString :click derecho >> Sourse >> Generate to string >> Generate 

	@Override
	public String toString() {
		return "Employee [nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", salario: $" + salario
				+ ", puesto: " + puesto + "]";
	}
	
}
