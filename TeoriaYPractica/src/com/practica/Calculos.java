package com.practica;

public class Calculos {

	public static void main(String[] args) {

		/*
		 * Actividad 3: Creas una clase llamada Calculos Debes utilizar la clase Math y
		 * las funciones que tiene. El n�mero ser� 123456789,987654321 NO pierdas
		 * precisi�n. Debes mostrar en consola . el doble. el triple la ra�z cuadrada el
		 * seno el coseno el logaritmo neperiano. si es primo o no.
		 */

		double num = 123456789.987654321;
		double resultadoraiz = Math.sqrt(num);
		double resultadoseno = Math.sin(num);
		double resultadocoseno = Math.cos(num);
		double resultadolog = Math.log(num);
		long numredondeado = Math.round(123456789.987654321);
		int contador = 0;

		System.out.println("El doble del n�mero es: " + num * 2);
		System.out.println("El triple del n�mero es: " + num * 3);
		System.out.println("La ra�z cuadrada del n�mero es: " + resultadoraiz);
		System.out.println("El seno del n�mero es: " + resultadoseno);
		System.out.println("El coseno del n�mero es: " + resultadocoseno);
		System.out.println("El logaritmo neperiano del n�mero es: " + resultadolog);

		for (int i = 1; i <= numredondeado; i++) {
			if ((numredondeado % i) == 0) {
				contador++;
			}
		}

		if (contador <= 2) {
			System.out.println("El n�mero es primo");
		} else {
			System.out.println("El n�mero no es primo");

		}

	}

}
