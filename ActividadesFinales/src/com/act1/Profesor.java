package com.act1;

//clase hija que extiende la clase padre (Persona)
public class Profesor extends Persona {

	// m�todos propios de la clase hija que devuelven valores
	// sobrecarga: m�todos con el mismo nombre y distintos argumentos
	public void dondetrabaja(String instituto, String ciudad)// pasando par�metros al m�todo
	{
		System.out.println(getNombre() + " " + getApellido() + " trabaja en el instituto " + instituto
				+ " en la ciudad de " + ciudad);
	}

	public void dondetrabaja(String pais)// pasando par�metros al m�todo
	{
		System.out.println("Trabajo en " + pais);
	}

	// sobrescritura: m�todo cuyo nombre es igual a un m�todo de la clase padre
	public void hablar() {

		System.out.println("�Soy un profesor que est� hablando!");
	}
}
