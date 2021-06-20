package com.act4;

import java.util.Scanner;

public class AsignaturasDAM {

	public static void main(String[] args) {

		// array de asignaturas de tipo String llamado asignaturas con un tama�o de 5
		String[] asignaturas = new String[5];

		// Scanner para leer las asignaturas que el usuario introduzcalas cuales se
		// introducir�n en el array
		Scanner escaner = new Scanner(System.in);

		// bucle para preguntar las 5 asignaturas que contendr� el array
		for (int i = 0; i < asignaturas.length; i++) {

			// enumera las preguntas cogiendo la posici�n de cada asignatura en el array
			System.out.println("Buenas, introduzca la asignatura n�mero " + i);
			// recogemos en la variable asignatura la respuesta del usuario
			String asignatura = escaner.nextLine();
			// condicion donde si el usuario escribe "q" o "Q" le informa de que ha salido
			// del programa
			if (asignatura.equalsIgnoreCase("Q")) {
				System.out.println("Ha salido del programa");
				System.exit(1);
			}
			// si no presiona Q, el bucle sigue preguntando
			else {
				asignaturas[i] = asignatura;
			}

		}

		// cuando acaba el bucle informa de que el usuario ha acabado
		System.out.println("Ha finalizado, ha introducido las siguientes asignaturas:\n");

		// bucle que recorre el array mostrando los datos de este (las asignaturas
		// recopiladas)
		for (int i = 0; i < asignaturas.length; i++) {

			System.out.println(asignaturas[i]);

		}

	}

}
