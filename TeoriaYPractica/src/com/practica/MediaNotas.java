package com.practica;

public class MediaNotas {

	public static void main(String[] args) {

		/*
		 * Actividad 1: Crea una clase llamada MediaNotas en donde creas un array que
		 * guarda 6 notas. las notas pueden tener decimales. Introduce las notas que
		 * quieras. Muestra en consola la nota media. Si la nota media es menor de 5
		 * aparece, al lado, suspenso. si es entre 5 y menor de 7 aparece bien si sale
		 * más o igual 7 y menor o igual de 8, notable si sale mayor de 8 y hasta 10 .
		 * sobresaliente.
		 */

		double[] notas = { 9.5, 7.6, 8.4, 6, 9.1, 8 };
		int longitud = notas.length;
		double suma = 0;

		for (int i = 0; i < longitud; i++) {
			suma = suma + notas[i];
		}

		double media = (Math.round((suma / longitud) * 100d) / 100d);

		System.out.println("La nota media es " + media);

		if (media < 5) {
			System.out.println("Suspenso");
		} else if (media >= 5 && media < 7) {
			System.out.println("Bien");
		} else if (media >= 7 && media <= 8) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}

	}

}
