package com.teoria;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("método main ok");
		String mensaje="un mensaje a tu gusto";
		System.out.println(mensaje);
		int unidades =15;//declaración y asignación
		float precio = 7.5f;
		float total=0;//declaración e inicialización
		if (precio>10) {
		total = unidades * precio;//asignación
		}
		else {
			System.out.println("muy barato");
		}
		
		System.out.println("el total es "+ total);
		
	}//cierra método main

}//cierra clase
