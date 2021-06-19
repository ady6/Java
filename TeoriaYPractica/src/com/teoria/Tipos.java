package com.teoria;

public class Tipos {

	public static void main(String[] args) {

		System.out.println("hola");
		int unidades=10;
		float precio=5.7f;
		String producto="camisa";
		boolean descuento=true;
		char talla='s';
		float total;
		
		if (descuento)
		{
			total=unidades*precio*0.8f;
		}
		else
		{
			total=unidades*precio;
		}
		
		System.out.println("el total es "+Math.round(total)+" euros");
		
		//operador ternario
		//programación funcional
		
		
	}// cierra main

}// cierra clase
