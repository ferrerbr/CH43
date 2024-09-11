package org.generation.employee.developer;

public class DeveloperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer brandon =new Developer("brandon","ferrer",26,16000f,"DB Administrator", NivelDominio.JUNIOR , LenguajesProgramacion.SQL);
		
		Developer miguel =new Developer("miguel","angel",26,15000f,"metodos numericos", NivelDominio.JUNIOR , LenguajesProgramacion.MATLAB);
		
		//imprimimor por el metodo toString
		System.out.println(brandon);
		miguel.calcularSalario();
		brandon.trabajar();
		
		

	}

}
