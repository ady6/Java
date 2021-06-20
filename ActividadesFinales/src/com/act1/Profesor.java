package com.act1;

//clase hija que extiende la clase padre (Persona)
public class Profesor extends Persona {

	// métodos propios de la clase hija que devuelven valores
	// sobrecarga: métodos con el mismo nombre y distintos argumentos
	public void dondetrabaja(String instituto, String ciudad)// pasando parámetros al método
	{
		System.out.println(getNombre() + " " + getApellido() + " trabaja en el instituto " + instituto
				+ " en la ciudad de " + ciudad);
	}

	public void dondetrabaja(String pais)// pasando parámetros al método
	{
		System.out.println("Trabajo en " + pais);
	}

	// sobrescritura: método cuyo nombre es igual a un método de la clase padre
	public void hablar() {

		System.out.println("¡Soy un profesor que está hablando!");
	}
}
