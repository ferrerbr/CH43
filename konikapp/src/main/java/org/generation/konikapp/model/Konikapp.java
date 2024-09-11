package org.generation.konikapp.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Konikapp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre", length = 60, nullable = false, unique = false)
    private String nombre;
	
	@Column(name = "apellido", length = 60, nullable = false, unique = false)
    private String apellido;
	
	@Column(name = "email", length = 60, nullable = false, unique = true)
    private String email;
	
	@Column(name = "constraseña", length = 12, nullable = false, unique = false)
    private String password;
	
	@Column(name = "numero_telefono", length = 20, nullable = false, unique = false)
    private String numeroTelefono;
	
	@Column(name = "fecha_nacimiento", nullable = false, unique = false)
    private LocalDate fechaNacimiento; 
	
	@Column(name = "ciudad", length = 60, nullable = false, unique = false)
	private String ciudad;
	
	@Column(name = "estado", length = 60, nullable = false, unique = false)
    private String estado;
	
	@Column(name = "cp", length = 60, nullable = false, unique = false)
    private String codigoPostal;
	
	@Column(name = "direccion", length = 60, nullable = false, unique = false)
    private String direccion;
    
    // Constructor vacío para JPA
    public Konikapp() {
    	
    }
    
    // Constructor con todos los campos, incluyendo ciudad
	public Konikapp(Long id, String nombre, String apellido, String email, String password, String numeroTelefono,
			LocalDate fechaNacimiento, String ciudad, String estado, String codigoPostal, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.numeroTelefono = numeroTelefono;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudad = ciudad;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
		this.direccion = direccion;
	}
	
	// Getters y Setters
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Método toString
	@Override
	public String toString() {
		return "Konikapp [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", password=" + password + ", numeroTelefono=" + numeroTelefono + ", fechaNacimiento="
				+ fechaNacimiento + ", ciudad=" + ciudad + ", estado=" + estado + ", codigoPostal=" + codigoPostal
				+ ", direccion=" + direccion + "]";
	}

	// Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(apellido, ciudad, codigoPostal, direccion, email, estado, fechaNacimiento, id, nombre,
				numeroTelefono, password);
	}

	// Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konikapp other = (Konikapp) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(ciudad, other.ciudad)
				&& Objects.equals(codigoPostal, other.codigoPostal) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(estado, other.estado)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(numeroTelefono, other.numeroTelefono)
				&& Objects.equals(password, other.password);
	}
}
