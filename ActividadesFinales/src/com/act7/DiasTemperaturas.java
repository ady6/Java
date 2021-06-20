package com.act7;

public class DiasTemperaturas {

	public static void main(String[] args) {
		
		//array multidimensional (array de arrays)
		//los espacios en algunas temperaturas son simplemente para conseguir una respuesta
		//m�s visual en cuanto a dise�o al imprimir en pantalla
		String[][] array =
		{{"-", "Lunes", "Martes", "Mi�rcoles", "Jueves", "Vienes", "S�bado", "Domingo"},//fila de dias de la semana
		{"T� Min", "15�C", " 13�C", "   8�C", "         -2�C", "  1�C", "  16�C", "  6�C"},//fila con temperatura minima
		{"T� Max", "22�C", " 20�C", "   15�C", "         10�C", "  11�C", "  26�C", "  14�C"}};//fila con temperatura maxima

		System.out.println("Tabla con los d�as de la semana y temperaturas m�ximas y m�nimas\n");//cabecera
		pantalla(array);//muestro mi array utilizando la funci�n "pantalla" creada abajo
		
	}
		
		public static void pantalla(String x[][]) {//funci�n que recibe un array "x" de tipo String
			
			for (int fila=0;fila<x.length;fila++) {//recorro las filas del array x
				for(int columna=0;columna<x[fila].length;columna++) {//recorro las columnas del array x
					
					System.out.print(x[fila][columna]+"\t");//muestro las filas y columnas
				}
				
				System.out.println();//evito que se imprima el array en una s�la l�nea (as� se muestra encasillado correctamente)
			}
		}

}
