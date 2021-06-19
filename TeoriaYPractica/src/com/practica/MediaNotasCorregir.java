package com.practica;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MediaNotasCorregir {

	public static void main(String[] args) {
		
		long inicio=System.currentTimeMillis();
		
		//almacenar notas con decimales en array
		
	double[] notas = { 7.5, 8.6, 4.6, 6.5};
		float total=0;//declarar variable
		float media=0.0f;
		int notaEntera=0;
		String notaTexto;
		for (double f : notas) { //estructura foreach
			total+=f;
		}
		
		System.out.println("La suma es " + total);
		media=total/notas.length;
		notaEntera=(int) Math.round(media);
		
		switch (notaEntera) {
		case 9:
		case 10:
			notaTexto="Sobresaliente";
			break;
			
		case 8:
		case 7:
			notaTexto="Notable";
			break;
			
		case 6:
			notaTexto="Bien";
			break;
			
		case 5:
			notaTexto="Aprobado";
			break;

		default:
			notaTexto="Suspenso";
			break;
		}
		
		System.out.println("Tu calificación es " + notaTexto);
		
		//calcular la media de las notas con programacion funcional
		
		OptionalDouble mediaNotasFuncional = Arrays.stream(notas).average();
		
		System.out.println("Tu nota media es " + mediaNotasFuncional);
		
		
		long fin=System.currentTimeMillis();
		long tiempo=fin-inicio;
		System.out.println("Has tardado " + tiempo + "ms");
		
	}

}
