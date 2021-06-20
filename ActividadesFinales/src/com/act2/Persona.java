//clase Persona que implementa la interfaz Cantante
package com.act2;

public class Persona implements ICantante {

	// métodos sin parámetros que define la interfaz a los que les añado código
	@Override
	public void cantar() {

		System.out.println("La la laaa ra laa");

	}

	@Override
	public void entonar() {

		System.out.println("A E I O UUU");

	}

	// método con parámetro que define la interfaz cantante al que le añado código
	@Override
	public String valoracionCanto(float numValoracion) {
		return "La valoración del canto de esta persona es de " + numValoracion;
	}

}
