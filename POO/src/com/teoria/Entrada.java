package com.teoria;

import java.io.IOException;

public class Entrada {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Quieres continuar? (y/n)");
		
		char respuesta;//declarar una variable
		
		respuesta = (char) System.in.read();
		
		//condicion con operador ternario
		//condicion?true:false
		
		String solucion=(respuesta=='y')?"okey":"no válido";
		
		System.out.println(solucion);
		
		
	}//cierra main

}//ciera class
