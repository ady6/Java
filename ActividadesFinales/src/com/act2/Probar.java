//clase ejecutable para probar los m�todos
package com.act2;

public class Probar {

	public static void main(String[] args) {

		// creo un objeto Persona y un objeto Periquito
		Persona persona1 = new Persona();
		Periquito periquito1 = new Periquito();

		// pruebo los m�todos sin par�metros
		persona1.cantar();
		periquito1.cantar();

		persona1.entonar();
		periquito1.entonar();

		// pruebo el m�todo con par�metros, como el n�mero de valoraci�n es float y me
		// pide un double, casteo el argumento a float
		System.out.println(persona1.valoracionCanto((float) 7.2));
		System.out.println(periquito1.valoracionCanto((float) 9.8));

	}

}
