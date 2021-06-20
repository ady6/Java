package com.act5;

import javax.swing.JOptionPane;

public class NumerosImpares {

	public static void main(String[] args) {
		
		int inicio; // n�mero de inicio elegido por el usuario
		int contador = 0; // contador
		int fin;// n�mero final elegido por el usuario
		String almacen = ""; // se almacenar�n los n�meros impares del bucle
		int suma = 0;
		int almacenint = 0;

		String dato = JOptionPane.showInputDialog("Buenas, introduzca un n�mero entero, este ser� el n�mero inicial:");

		// parseo "dato" ya que es una cadena tomada del JOptionPane a entero dentro de la variable "inicio"
		inicio = Integer.parseInt(dato);
		
		String dato2 = JOptionPane.showInputDialog("Buenas, introduzca un n�mero entero, este ser� el n�mero final:");

		// parseo "dato2" ya que es una cadena tomada del JOptionPane a entero dentro de la variable "fin"
		fin = Integer.parseInt(dato2);

		// bucle que recorre el rango desde la variable "inicio" hasta la variable "fin", con esta incluida
		for (int i = inicio; i <= fin; i++) {
			if (esImpar(i)) {// condici�n que debe cumplir el n�mero para ser impreso (funci�n esImpar)
				contador++;// contador para mostrar el total de n�meros impares
				almacen =String.valueOf(i);// almaceno los n�meros impares del bucle en la variable almac�n
				almacenint = Integer.parseInt(almacen);//parseo almacen a entero
				suma = almacenint+suma;
			}

		}

		JOptionPane.showMessageDialog(null, ("La suma de n�meros impares es "+suma));// muestra en un panel los n�meros primos recogidos en almacen

		JOptionPane.showMessageDialog(null, "\nTotal de n�meros impares: " + contador);// muestra el total de n�meros impares
	}

	public static boolean esImpar(int numero) {// funci�n para determinar si es impar
		
		if (numero%2==0)
		    return false;//es par
		else
		    return true;//es impar


	}

}
