package org.generation.funciones;
import java.util.ArrayList;
import java.util.List;


public class Funciones {
	
	public class Juguetibici {
		
		static class Producto{
		String nombre;
		double precio;
		
		Producto(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
			}
	
		}
	
	static class CarritoCompra {
		List<Producto>productos = new ArrayList <>();
		void agregarProductos (Producto barbie) {
			productos.add(barbie);
			}
		
		double calcularTotal() {
			double total = 0;
			for(Producto barbie: productos);{
			total += barbie.precio;
		}
			
		return  total;
		
	}
		
	}
	
	}
	public static void main (String[] args) {
	
	Producto munieca = new Producto("Brarbie",199.99);
	Producto munieca2 = new  Producto("CHELSEA", 149.99);
	Producto munieca3 = new Producto("Skipper", 129.99);

	}
}