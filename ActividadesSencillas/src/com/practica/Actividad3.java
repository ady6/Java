package com.practica;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		System.out.println("Introduzca una ciudad por teclado:");

		String ciudad = "Madrid";

		Scanner lector = new Scanner(System.in);

		ciudad = lector.nextLine();

		lector.close();

		if (ciudad.equals("Madrid")) {
			System.out.println("La ciudad elegida, " + ciudad + ", es la capital de España");

		} else if (ciudad.equals("Sevilla")) {
			System.out.println("La ciudad elegida, " + ciudad + ", es provincia de Andalucía");

		} else {
			System.out.println(ciudad + " es una bonita ciudad :)");
		}

	}

}
