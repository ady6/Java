/*Explica qué diferencia hay entre Double y OptionalDouble
 * Double: variable que guarda números en memoria que tienen parte entera y parte decimal.
 * OptionalDouble: variable que puede o no contener un double.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		// 1T
		List notasT1 = new ArrayList();
		Scanner lector = new Scanner(System.in);
		int nota = 0;
		int cont = 0;
		int suma = 0;
		int media = 0;

		// 2T
		List notasT2 = new ArrayList();
		Scanner lector2 = new Scanner(System.in);
		int nota2 = 0;
		int cont2 = 0;
		int suma2 = 0;
		int media2 = 0;

		// 3T
		List notasT3 = new ArrayList();
		Scanner lector3 = new Scanner(System.in);
		int nota3 = 0;
		int cont3 = 0;
		int suma3 = 0;
		int media3 = 0;

		// Curso
		int sumacurso = 0;
		int mediacurso = 0;
		String notaTexto;

		// 1T
		System.out.println(
				"Introduce las 6 notas del 1T. Recuerde escribir la nota para el boletín como un número entero.");

		do {
			nota = lector.nextInt();
			if (nota < 0 || nota > 10) {
				System.out
						.println("Error: no ha introducido una nota válida. Siga introduciendo notas que sí lo sean.");
			} else {
				notasT1.add(nota);
				cont++;
				suma = suma + nota;
			}
		} while (cont < 6);

		media = suma / 6;

		System.out.println("La nota media del primer trimestre es: " + media);

		// 2T
		System.out.println(
				"Introduce las 6 notas del 2T. Recuerde escribir la nota para el boletín como un número entero.");

		do {
			nota2 = lector2.nextInt();
			if (nota2 < 0 || nota2 > 10) {
				System.out.println("Error: no ha introducido una nota válida. Siga introduciendo notas que sí lo sean.");
			} else {
				notasT2.add(nota);
				cont2++;
				suma2 = suma2 + nota2;
			}
		} while (cont2 < 6);

		media2 = suma2 / 6;

		System.out.println("La nota media del segundo trimestre es: " + media2);

		// 3T
		System.out.println(
				"Introduce las 6 notas del 3T. Recuerde escribir la nota para el boletín como un número entero.");

		do {
			nota3 = lector3.nextInt();
			if (nota3 < 0 || nota3 > 10) {
				System.out
						.println("Error: no ha introducido una nota válida. Siga introduciendo notas que sí lo sean.");
			} else {
				notasT3.add(nota);
				cont3++;
				suma3 = suma3 + nota3;
			}
		} while (cont3 < 6);

		media3 = suma3 / 6;

		System.out.println("La nota media del tercer trimestre es: " + media3);

		// Media total del curso
		sumacurso = media + media2 + media3;
		mediacurso = (sumacurso) / 3;
		switch (mediacurso) {
		case 9:
		case 10:
			notaTexto = "Sobresaliente";
			break;

		case 8:
		case 7:
			notaTexto = "Notable";
			break;

		case 6:
			notaTexto = "Bien";
			break;

		case 5:
			notaTexto = "Aprobado";
			break;

		default:
			notaTexto = "Suspenso";
			break;
		}

		System.out.println("La nota media del curso es: " + notaTexto);
	}
}
