package org.generation.ejercicio5;

public class Estudiante {
	private String nombre;
	private int edad;
	private  float calificacionP;
	
	
	// metodo constructor
	 public Estudiante(String nombre,int edad,float calificacionP) {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.calificacionP =calificacionP;
		 
	 }
	 // metodos de comportamiento
	 
	 // metodo para mostrar informacion
	 public void mostrarInformacion() {
		 System.out.println("El estudiante " + nombre +" de edad "+ edad + " tiene una calificacion promedio de " +calificacionP);
	 }
	 
	 // metodo para decirle si es aluno es aporbado o no 
	 public void esAprobado() {
		 String aprobacion ;
		 if ( calificacionP >60 ) {
			  aprobacion = " es aporbado";
		 }else {
			  aprobacion = " no es aprobado ";
		 }
			 
		 System.out.println("El estudiante " + nombre + aprobacion );
	 }
	 
	 // getters y setters 
	  public  String getNombre() {
		  return nombre; 
	  }
	   public  void  setNombre(String nombre){
		   this.nombre= nombre;
	   }
	   
	   
	   public int getEdad() {
		   return edad;
	   }
	   public void setEdad(int edad) {
		   this.edad = edad;
	   }
	   
	   
	   public float getCalificacionP() {
		   return calificacionP;
	   }
	   public void setCalificacionP(float calificacionP) {
		   this.calificacionP = calificacionP;
	   }
	   
	   // metododo to string 


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", calificacionP=" + calificacionP + "]";
	}
	   
	   

}
