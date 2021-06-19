package com.practica;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		System.out.println("¿Quién es el creador de Java?");

		String creador = "James Gosling";

		Scanner lector = new Scanner(System.in);

		creador = lector.nextLine();

		while (!creador.equals("James Gosling")) {
			System.out.println("Incorrecto, ¿Quién es el creador de Java?");
			creador = lector.nextLine();
		} 
		
		System.out.println ("¡Correcto!");

		lector.close();
	}
}
