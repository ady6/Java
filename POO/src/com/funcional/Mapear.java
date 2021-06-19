package com.funcional;

import java.util.Arrays;

public class Mapear {

	public static void main(String[] args) {
		
		int[] numeros = {10,45,65,85,95,35,65,25,45};
		
		System.out.println(numeros[0]);//leer un elemento del Array
		
		//obtener la suma de todos los números
		int total=0;
		for (int i = 0; i < numeros.length; i++) {
			total +=numeros[i];
		}
		System.out.println("la suma 2 es "+total);
		
		//ejemplo con foreach
		int total2=0;
		for (int i : numeros) {
			total2+=i;
		}
		System.out.println("la suma 2 es "+total2);
		
		//ejemplo con programacion funcional
		int total3 = Arrays.stream(numeros).sum();
		System.out.println("la suma 3 es "+total3);
		
	}

}
