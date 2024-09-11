package com.pandevs.pandevs.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// para convetir mi Java class en una entidad, necesito las anotaciones de JPA (Java Persistenve API). Ademas JPA necesita un constructor vacio

/*
 * Anotaciones de JPA:
 * -@Entity para  indicar que dicha clase es una entidad OMR
 * @Table(name = "tableName"schema ="db) para indicar el nombre que llevara nu tabla eb el esquema especificado
 *  @Id para  indicar una llave primaria (Pk)
 *  @GenerateValue
 *   @Colum me permite configurar cada atributo como una columna de una tabla*/

@Entity
@Table(name = "user")
public class User {
	
	//id, username, email, pasword
	 @Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	 @Column(name = "id_user")
	private long id;
	 
	 @Column(name = "username", length = 60, nullable = false, unique= true)
	private String username;
	 
	 @Column(name = "mail", length = 120, nullable = false, unique= true)
	private String mail;
	 
	 @Column(name = "password", length = 15, nullable = false, unique= false)
	private String password;
	
	//constructor vacio para JPA
	public User() {
		
	}
	
	
	//metodo constructor

	public User(long id, String username, String mail, String password) {
		super();
		this.id = id;
		this.username = username;
		this.mail = mail;
		this.password = password;
	}
	
	//metodos getter y setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//metodos to string

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", mail=" + mail + ", password=" + password + "]";
	}

	
	//metodo hash code
	@Override
	public int hashCode() {
		return Objects.hash(id, mail, password, username);
	}

	//Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(mail, other.mail) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	
	
	
	
	

}
