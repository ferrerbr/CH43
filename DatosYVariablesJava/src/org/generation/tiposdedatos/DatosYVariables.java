package org.generation.tiposdedatos;

public class DatosYVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo vamos al cine");
		


/*Tipos de datos
 * Numeros enteros
 * byte
 * short
 * int
 * long
 * numeros decimales
 * float
 * double
 * caracteres
 * char
 * boolean
 * cadena de texto
 * string */


/*Operdores aritemeticos
 * + suma
 * - resta
 * * multiplicacion
 / division
  * % residuo*/

/*Operadores de comparacion
 * == compara si un operando es igual a otro
 * != compara si es diferente
 * < menor que
 * > mayor que
 * <= menor o igual que
 * >= mayor o igual que*/
/* Operadores lógicos
* && and
* || or
* ! not*/

//ejercicio sistema de un cine

		byte numeroDeSalas = 8;
		short asientosPorSala = 120;
		int entradasVendidas = 75;
		int totalDeAsientos = numeroDeSalas * asientosPorSala;
		long ingresosTotales =3500;
		float precioEntrada =99.99f;  // es obligatorio poner f al final de  el numero flotante
		double precioCombo = 249.00;
		char letraAsiento = 'A';
		boolean estaAbierto = true;
		String nombreCine ="Cinemex";
		
		
		System.out.println("Numero de salas: " + numeroDeSalas);
		System.out.println("Asientos Por Salas: " + asientosPorSala);
		System.out.println("Entradas Vendeidas: " + entradasVendidas);
		System.out.println("Toral de Asientos: " + totalDeAsientos);
		System.out.println("Ingresos totales: " + ingresosTotales);
		System.out.println("Precio de entrada: " + precioEntrada);
		System.out.println("Precio del combo: " + precioCombo);
		System.out.println("Letra del asiento" + letraAsiento);
		System.out.println("¿El cine esta abierto? " + precioEntrada);
		System.out.println("Nombre del cine: "+nombreCine);
		
		//operadores Aritmeticos
		int totalEntradas = asientosPorSala - entradasVendidas;
		System.out.println("Las entradas restantes: " + totalEntradas);
		
		
		
		//Casteo es una conversion de datos que no utiliza metodos
		
		//casteo a entero
		int precioEntradaEntero = (int) precioEntrada;
		int precioComboEntero = (int) precioCombo;
		System.out.println("el precio de entrada es :" + precioEntradaEntero);
		System.out.println("el precio del combo es" + precioComboEntero);
		
		
		
		//entero a long
		long entradasVendidasLong = (long) entradasVendidas;
		System.out.println("el total de entradas vendidas es long es " + entradasVendidasLong);
		
		
		
		// entero a string ESTO NO ES UN CASTEO SE HACE USO DE UN METODO PARA HACER EL CAMBIO DE TIPO DE DATO
		
		String entradasVendidasString = Integer.toString(entradasVendidas);
		System.out.println("Entradas vendidas en string" + entradasVendidasString);
		
		
		
		//String a un entero
		
		String entradasString = "75";
		int entradasInt = Integer.parseInt(entradasString);
		System.out.println("Venta boletos vendidos" + entradasInt);
		
		//string a double
		String precioComboDouble = "157.50";
		double comboDouble = Double.parseDouble(precioComboDouble);
		System.out.println("el precio en data type double: " + comboDouble);
		
		
		
		/*
		 * 1. Calcular los ingresos por entradas.
		2. Calcular los ingresos por ventas de palomitas.
		3. Calcular los ingresos por ventas de bebidas.
		4. Calcular el total de ingresos combinando entradas, palomitas y bebidas.
		5. Mostrar los ingresos totales.
		
		Determinar si los clientes pueden obtener un descuento basado en su edad o condición de estudiante.
		
		- Determinar si el cliente tiene menos de 12 años, más de 65 años, o es estudiante.
		20% de descuento en la entrada
				
		*/
		System.out.println(" ");
		System.out.println("Ejercicio ");


		
		float ingresosPorEntradas = entradasVendidas * precioEntrada;
		System.out.println("los ingresos totales de las entrdas son: " + ingresosPorEntradas);
		
		int palomitasVendidas = 52;
		float precioPalomitas = 120f;
		float ingresosVentaDePalomitas = palomitasVendidas * precioPalomitas ;
		System.out.println("Igresos por venta de palomitas: " + ingresosVentaDePalomitas);
		
		int bebidasVendidas = 50;
		float precioBebidas = 60.5f;
		float ingresosVentaBebidas = bebidasVendidas *precioBebidas;
		System.out.println("Ingreso por venta de bebidas: " + ingresosVentaBebidas);
		
		float ingresosTotales2 = ingresosPorEntradas  + ingresosVentaDePalomitas + ingresosVentaBebidas;
		System.out.println("Los ingresos totales (entradas + palomitas + refresco): " + ingresosTotales2);
		
		int edad = 26;
		boolean estudiante = true;
		
		if (estudiante == true) {
			System.out.println("Felicidades tienes un descuento del 20% en la entrada al cine");
		}else {
			if(edad < 12 || edad > 65) {
				System.out.println("Felicidades tienes un descuento del 20% en la entrada al cine ");

			}else {
				System.out.println("Lo sentimos no cumples con los requerimientos para un descuento");

			}
		}

		

		


		




		







		}
	}



