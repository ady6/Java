//clase ejecutable para probar los métodos
package com.act2;

public class Probar {

	public static void main(String[] args) {

		// creo un objeto Persona y un objeto Periquito
		Persona persona1 = new Persona();
		Periquito periquito1 = new Periquito();

		// pruebo los métodos sin parámetros
		persona1.cantar();
		periquito1.cantar();

		persona1.entonar();
		periquito1.entonar();

		// pruebo el método con parámetros, como el número de valoración es float y me
		// pide un double, casteo el argumento a float
		System.out.println(persona1.valoracionCanto((float) 7.2));
		System.out.println(periquito1.valoracionCanto((float) 9.8));

	}

}
