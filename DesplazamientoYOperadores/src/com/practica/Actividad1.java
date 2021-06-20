package com.practica;

public class Actividad1 {

	public static void main(String[] args) {

		// Declaro dos variables de tipo entero
		int numero1 = 66;
		int numero2 = 32;

		// Operador condicional simple &
		if (numero1 > 50 & numero2 < 40) {
			System.out.println("Todo correcto");
		} else {
			System.out.println("No correcto");
		}

		// Operador condicional doble &&
		if (numero1 > 50 && numero2 < 40) {
			System.out.println("Todo correcto");
		} else {
			System.out.println("No correcto");
		}

	}

}
