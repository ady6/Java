package com.act4;

import javax.swing.JOptionPane;

public class NumerosPrimos {

	public static void main(String[] args) {

		int inicio = 0; // número de inicio
		int contador = 0; // contador
		int fin;// número final elegido por el usuario
		String almacen = ""; // se almacenarán los números primos del bucle

		String dato = JOptionPane.showInputDialog("Buenas, introduzca un número entero:");

		// parseo "dato" ya que es una cadena tomada del JOptionPane a entero dentro de
		// la variable "fin"
		fin = Integer.parseInt(dato);

		// bucle que recorre el rango desde la variable "inicio" (0) hasta la variable
		// "fin" (número elegido por usuario), con "fin" incluida
		for (int i = inicio; i <= fin; i++) {
			if (esPrimo(i)) {// condición que debe cumplir el número para ser impreso (función esPrimo)
				contador++;// contador para mostrar el total de números primos
				almacen += (String.valueOf(i) + "  ");// concateno cada número primo del bucle en la variable almacén
			}

		}

		JOptionPane.showMessageDialog(null, (almacen));// muestra en un panel los números primos recogidos en almacen

		JOptionPane.showMessageDialog(null, "\nTotal de números primos: " + contador);// muestra el total de números primos
	}

	public static boolean esPrimo(int numero) {// función para determinar si es primo
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int i = 2; i < numero / 2; i++) {
			// Si es divisible por cualquiera de estos números, no es primo
			if (numero % i == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;

	}
}
