package com.practica;

public class Actividad1 {

	public static void main(String[] args) {

		double[] temperaturas = { 34.2, 36.5, 38.6, 35.3, 39 };
		double suma = 0;
		double media;
		for (int i = 0; i < temperaturas.length; i++) {
			suma = suma + temperaturas[i];
		}
		media = suma / temperaturas.length;
		System.out.println("La media de las temperaturas es de " + media + "°");
	}

}
