package com.teoria;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("m�todo main ok");
		String mensaje="un mensaje a tu gusto";
		System.out.println(mensaje);
		int unidades =15;//declaraci�n y asignaci�n
		float precio = 7.5f;
		float total=0;//declaraci�n e inicializaci�n
		if (precio>10) {
		total = unidades * precio;//asignaci�n
		}
		else {
			System.out.println("muy barato");
		}
		
		System.out.println("el total es "+ total);
		
	}//cierra m�todo main

}//cierra clase
