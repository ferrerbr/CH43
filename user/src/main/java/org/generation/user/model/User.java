package org.generation.user.model;


// creamos el objeto con atributos y objetos 
public class User {
	//id noombre , email, contraseña
	private Long id;
	private String nombre;
	private String email;
	private String pasword;
	
	// constructor 

	public User(Long id, String nombre, String email, String pasword) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.pasword = pasword;
	}
	
	
	//getter y setters


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	//metodo toString
	@Override
	public String toString() {
		return "User id:" + id + ", nombre:" + nombre + ", email:" + email + ", pasword:" + pasword ;
	}
	
	
	
	
	
	
}
