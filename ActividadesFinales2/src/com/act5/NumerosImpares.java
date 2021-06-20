package com.act5;

import javax.swing.JOptionPane;

public class NumerosImpares {

	public static void main(String[] args) {
		
		int inicio; // número de inicio elegido por el usuario
		int contador = 0; // contador
		int fin;// número final elegido por el usuario
		String almacen = ""; // se almacenarán los números impares del bucle
		int suma = 0;
		int almacenint = 0;

		String dato = JOptionPane.showInputDialog("Buenas, introduzca un número entero, este será el número inicial:");

		// parseo "dato" ya que es una cadena tomada del JOptionPane a entero dentro de la variable "inicio"
		inicio = Integer.parseInt(dato);
		
		String dato2 = JOptionPane.showInputDialog("Buenas, introduzca un número entero, este será el número final:");

		// parseo "dato2" ya que es una cadena tomada del JOptionPane a entero dentro de la variable "fin"
		fin = Integer.parseInt(dato2);

		// bucle que recorre el rango desde la variable "inicio" hasta la variable "fin", con esta incluida
		for (int i = inicio; i <= fin; i++) {
			if (esImpar(i)) {// condición que debe cumplir el número para ser impreso (función esImpar)
				contador++;// contador para mostrar el total de números impares
				almacen =String.valueOf(i);// almaceno los números impares del bucle en la variable almacén
				almacenint = Integer.parseInt(almacen);//parseo almacen a entero
				suma = almacenint+suma;
			}

		}

		JOptionPane.showMessageDialog(null, ("La suma de números impares es "+suma));// muestra en un panel los números primos recogidos en almacen

		JOptionPane.showMessageDialog(null, "\nTotal de números impares: " + contador);// muestra el total de números impares
	}

	public static boolean esImpar(int numero) {// función para determinar si es impar
		
		if (numero%2==0)
		    return false;//es par
		else
		    return true;//es impar


	}

}
