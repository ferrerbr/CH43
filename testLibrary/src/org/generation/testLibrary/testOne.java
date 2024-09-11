package org.generation.testLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOne {

	@Test
	void testAgregarProducto() {
		//instanciamos una nueca orden
		Orden ord = new Orden();
		//crear un producto
		Producto cafe = new Producto("cafe",30);
		orden.agregarProductos(cafe);
		//colocamos la afirmacion
		//las afirmaciones(o asserions en ingles ) son metodos que se  utilizan para verificar
		//si una condicion especifica es verdaderas o falsa durante la ejecucion 
		assertEqual(1,orden.getCantidadProductos())
		fail("Not yet implemented");
	}

}
