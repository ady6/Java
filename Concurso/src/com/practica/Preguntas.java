package com.practica;

import java.util.Scanner;

public class Preguntas {

	public static void main(String[] args) {

		// Declaraci�n de variables
		String creador = "James Gosling";
		String capital = "Madrid";
		String pais = "Italia";
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int puntuacion = 0;

		// Introducci�n
		System.out.println("�Bienvenido al concurso! Responda a las 3 preguntas.");

		// Primera pregunta
		System.out.println("Primera pregunta: �Qui�n es el creador de Java? Tiene 5 intentos.");

		Scanner lector1 = new Scanner(System.in);

		creador = lector1.nextLine();

		for (cont1 = 0; cont1 <= 6; cont1++) {
			cont1++;
			if (creador.equalsIgnoreCase("James Gosling")) {
				System.out.println("Correcto a la primera. Se lleva 5 puntos.");
				puntuacion = puntuacion + 5;
				break;
			} else {
				System.out.println("Incorrecto, �Qui�n es el creador de Java?");
				creador = lector1.nextLine();
			}
			if (creador.equalsIgnoreCase("James Gosling")) {
				System.out.println("Correcto a la segunda. Se lleva 4 puntos.");
				puntuacion = puntuacion + 4;
				break;
			}

			else {
				System.out.println("Incorrecto, �Qui�n es el creador de Java?");
				creador = lector1.nextLine();
			}
			if (creador.equalsIgnoreCase("James Gosling")) {
				System.out.println("Correcto a la tercera. Se lleva 3 puntos.");
				puntuacion = puntuacion + 3;
				break;
			} else {
				System.out.println("Incorrecto, �Qui�n es el creador de Java?");
				creador = lector1.nextLine();
			}
			if (creador.equalsIgnoreCase("James Gosling")) {
				System.out.println("Correcto a la cuarta. Se lleva 2 puntos.");
				puntuacion = puntuacion + 2;
				break;
			} else {
				System.out.println("Incorrecto, �Qui�n es el creador de Java?");
				creador = lector1.nextLine();
			}
			if (creador.equalsIgnoreCase("James Gosling")) {
				System.out.println("Correcto a la quinta. Se lleva 1 m�sero punto.");
				puntuacion = puntuacion + 1;
				break;
			} else {
				System.out.println("Ha gastado sus 5 intentos. Est� fuera del concurso.");
				System.out.println("No ha acertado ninguna pregunta, su puntuaci�n es de: "+puntuacion);
				System.exit(1);
			}

		} // cierra for


		// Segunda pregunta
		System.out.println("Segunda pregunta: �Cu�l es la capital de Espa�a? Tiene 5 intentos.");

		Scanner lector2 = new Scanner(System.in);

		capital = lector2.nextLine();

		for (cont2 = 0; cont2 <= 6; cont2++) {
			cont2++;
			if (capital.equalsIgnoreCase("Madrid")) {
				System.out.println("Correcto a la primera. Se lleva 5 puntos.");
				puntuacion = puntuacion + 5;
				break;
			} else {
				System.out.println("Incorrecto, �Cu�l es la capital de Espa�a?");
				capital = lector2.nextLine();
			}
			if (capital.equalsIgnoreCase("Madrid")) {
				System.out.println("Correcto a la segunda. Se lleva 4 puntos.");
				puntuacion = puntuacion + 4;
				break;
			}

			else {
				System.out.println("Incorrecto, �Cu�l es la capital de Espa�a?");
				capital = lector2.nextLine();
			}
			if (capital.equalsIgnoreCase("Madrid")) {
				System.out.println("Correcto a la tercera. Se lleva 3 puntos.");
				puntuacion = puntuacion + 3;
				break;
			} else {
				System.out.println("Incorrecto, �Cu�l es la capital de Espa�a?");
				capital = lector2.nextLine();
			}
			if (capital.equalsIgnoreCase("Madrid")) {
				System.out.println("Correcto a la cuarta. Se lleva 2 puntos.");
				puntuacion = puntuacion + 2;
				break;
			} else {
				System.out.println("Incorrecto, �Cu�l es la capital de Espa�a?");
				capital = lector2.nextLine();
			}
			if (capital.equalsIgnoreCase("Madrid")) {
				System.out.println("Correcto a la quinta. Se lleva 1 m�sero punto.");
				puntuacion = puntuacion + 1;
				break;
			} else {
				System.out.println("Ha gastado sus 5 intentos. Est� fuera del concurso.");
				System.out.println("Ha acertado 1 pregunta, su puntuaci�n es de: "+puntuacion);
				System.exit(1);
				break;
			}

		} // cierra for

		// Tercera pregunta
		System.out.println("Tercera pregunta: �Cu�l es el pa�s de nacimiento de Leonardo Da Vinci? Tiene 5 intentos.");

		Scanner lector3 = new Scanner(System.in);

		pais = lector3.nextLine();

		for (cont3 = 0; cont3 <= 6; cont3++) {
			cont3++;
			if (pais.equalsIgnoreCase("Italia")) {
				System.out.println("Correcto a la primera. Se lleva 5 puntos.");
				puntuacion = puntuacion + 5;
				break;
			} else {
				System.out.println("Incorrecto, �Cu�l es el pa�s de nacimiento de Leonardo Da Vinci?");
				pais = lector3.nextLine();
			}
			if (pais.equalsIgnoreCase("Italia")) {
				System.out.println("Correcto a la segunda. Se lleva 4 puntos.");
				puntuacion = puntuacion + 4;
				break;
			}

			else {
				System.out.println("Incorrecto, �Cu�l es el pa�s de nacimiento de Leonardo Da Vinci?");
				pais = lector3.nextLine();
			}
			if (pais.equalsIgnoreCase("Italia")) {
				System.out.println("Correcto a la tercera. Se lleva 3 puntos.");
				puntuacion = puntuacion + 3;
				break;
			} else {
				System.out.println("Incorrecto, �Cu�l es el pa�s de nacimiento de Leonardo Da Vinci?");
				pais = lector3.nextLine();
			}
			if (pais.equalsIgnoreCase("Italia")) {
				System.out.println("Correcto a la cuarta. Se lleva 2 puntos.");
				puntuacion = puntuacion + 2;
				break;
			} else {
				System.out.println("Incorrecto, �Cu�l es el pa�s de nacimiento de Leonardo Da Vinci?");
				pais = lector3.nextLine();
			}
			if (pais.equalsIgnoreCase("Italia")) {
				System.out.println("Correcto a la quinta. Se lleva 1 m�sero punto.");
				puntuacion = puntuacion + 1;
				break;
			} else {
				System.out.println("Ha gastado sus 5 intentos. Est� fuera del concurso.");
				System.out.println("Ha acertado 2 preguntas, su puntuaci�n es de: "+puntuacion);
				System.exit(1);
				break;
			}

		} // cierra for
		
		System.out.println("Ha acertado 3 preguntas, su puntuaci�n es de: "+puntuacion);
		lector1.close();
		lector2.close();
		lector3.close();

	}// cierra main

}// cierra clase
