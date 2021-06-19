package com.practica;

import java.util.Scanner; //Importo del código de la clase Scanner desde la biblioteca Java

public class Actividad2 {

	public static void main(String[] args) {
		
		System.out.println ("Escribe un número entero:");
		int num;
		Scanner lector = new Scanner(System.in);
		num = lector.nextInt();
		System.out.println ("El número introducido por teclado es: " + num);
		System.out.println("Los números pares hasta " + num + ": ");
		lector.close();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
	}
 
}
