//clase Persona que implementa la interfaz Cantante
package com.act2;

public class Persona implements ICantante {

	// m�todos sin par�metros que define la interfaz a los que les a�ado c�digo
	@Override
	public void cantar() {

		System.out.println("La la laaa ra laa");

	}

	@Override
	public void entonar() {

		System.out.println("A E I O UUU");

	}

	// m�todo con par�metro que define la interfaz cantante al que le a�ado c�digo
	@Override
	public String valoracionCanto(float numValoracion) {
		return "La valoraci�n del canto de esta persona es de " + numValoracion;
	}

}
