package com.act4;

import javax.swing.JOptionPane;

public class NumerosPrimos {

	public static void main(String[] args) {

		int inicio = 0; // n�mero de inicio
		int contador = 0; // contador
		int fin;// n�mero final elegido por el usuario
		String almacen = ""; // se almacenar�n los n�meros primos del bucle

		String dato = JOptionPane.showInputDialog("Buenas, introduzca un n�mero entero:");

		// parseo "dato" ya que es una cadena tomada del JOptionPane a entero dentro de
		// la variable "fin"
		fin = Integer.parseInt(dato);

		// bucle que recorre el rango desde la variable "inicio" (0) hasta la variable
		// "fin" (n�mero elegido por usuario), con "fin" incluida
		for (int i = inicio; i <= fin; i++) {
			if (esPrimo(i)) {// condici�n que debe cumplir el n�mero para ser impreso (funci�n esPrimo)
				contador++;// contador para mostrar el total de n�meros primos
				almacen += (String.valueOf(i) + "  ");// concateno cada n�mero primo del bucle en la variable almac�n
			}

		}

		JOptionPane.showMessageDialog(null, (almacen));// muestra en un panel los n�meros primos recogidos en almacen

		JOptionPane.showMessageDialog(null, "\nTotal de n�meros primos: " + contador);// muestra el total de n�meros primos
	}

	public static boolean esPrimo(int numero) {// funci�n para determinar si es primo
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int i = 2; i < numero / 2; i++) {
			// Si es divisible por cualquiera de estos n�meros, no es primo
			if (numero % i == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, s� es primo
		return true;

	}
}
