//clase Periquito, el cual también sabe cantar e implementa la interfaz Cantante
package com.act2;

public class Periquito implements ICantante {

	// métodos sin parámetros que define la interfaz a los que les añado código
	@Override
	public void cantar() {

		System.out.println("Pio pio pioo");
	}

	@Override
	public void entonar() {

		System.out.println("Pi pi pi pi piii");

	}

	// método con parámetro que define la interfaz cantante al que le añado código
	@Override
	public String valoracionCanto(float numValoracion) {
		return "La valoración del canto de este periquito es de " + numValoracion;
	}

}
