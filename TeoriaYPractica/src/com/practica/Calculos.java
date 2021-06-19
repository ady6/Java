package com.practica;

public class Calculos {

	public static void main(String[] args) {

		/*
		 * Actividad 3: Creas una clase llamada Calculos Debes utilizar la clase Math y
		 * las funciones que tiene. El número será 123456789,987654321 NO pierdas
		 * precisión. Debes mostrar en consola . el doble. el triple la raíz cuadrada el
		 * seno el coseno el logaritmo neperiano. si es primo o no.
		 */

		double num = 123456789.987654321;
		double resultadoraiz = Math.sqrt(num);
		double resultadoseno = Math.sin(num);
		double resultadocoseno = Math.cos(num);
		double resultadolog = Math.log(num);
		long numredondeado = Math.round(123456789.987654321);
		int contador = 0;

		System.out.println("El doble del número es: " + num * 2);
		System.out.println("El triple del número es: " + num * 3);
		System.out.println("La raíz cuadrada del número es: " + resultadoraiz);
		System.out.println("El seno del número es: " + resultadoseno);
		System.out.println("El coseno del número es: " + resultadocoseno);
		System.out.println("El logaritmo neperiano del número es: " + resultadolog);

		for (int i = 1; i <= numredondeado; i++) {
			if ((numredondeado % i) == 0) {
				contador++;
			}
		}

		if (contador <= 2) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");

		}

	}

}
