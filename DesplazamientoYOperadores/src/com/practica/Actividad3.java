package com.practica;

public class Actividad3 {

	public static void main(String[] args) {
		
		// Desplazamiento a la izquierda
		int j = 33;
		int k = j << 2;
		System.out.println("La variable k es "+k);
		
		// Desplazamiento a la derecha con signo
		int a = 132;
		int b = a >> 2;
		System.out.println("La variable b es "+b);
		
		// Desplazamiento a la derecha sin signo
				int x = -1;
				int y = x >>> 2;
				System.out.println("La variable y es "+y);
		}
	}

