//clase Periquito, el cual tambi�n sabe cantar e implementa la interfaz Cantante
package com.act2;

public class Periquito implements ICantante {

	// m�todos sin par�metros que define la interfaz a los que les a�ado c�digo
	@Override
	public void cantar() {

		System.out.println("Pio pio pioo");
	}

	@Override
	public void entonar() {

		System.out.println("Pi pi pi pi piii");

	}

	// m�todo con par�metro que define la interfaz cantante al que le a�ado c�digo
	@Override
	public String valoracionCanto(float numValoracion) {
		return "La valoraci�n del canto de este periquito es de " + numValoracion;
	}

}
