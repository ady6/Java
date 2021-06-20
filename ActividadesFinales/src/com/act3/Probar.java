package com.act3;

import javax.swing.JOptionPane;

public class Probar {

	public static void main(String[] args) {

		Calculos calculo1 = new Calculos();// creo un objeto Calculo

		// en unidades almaceno la respuesta del cliente
		String unidades = JOptionPane
				.showInputDialog("Buenas, introduzca el número de unidades que comprará del producto:");

		// como unidades es una cadena que recoge el valor que escribe cliente en el
		// JOptionPane, parseo el valor a int y lo almaceno en unidadesint
		int unidadesint = Integer.parseInt(unidades);

		String precio = JOptionPane.showInputDialog("Introduzca el precio por unidad del producto:");

		// hago lo mismo que antes pero esta vez lo parseo a float, ya que el método
		// pide un valor float en precio
		float perciofloat = Float.parseFloat(precio);

		// establezco los valores que pide el metodo (unidades y precio) con los valores
		// recogidos del cliente
		calculo1.setUnidades(unidadesint);
		calculo1.setPrecio(perciofloat);

		// pregunto si tiene descuento con un yes_no_option
		// si la respuesta es yes (0) descuento sera true en el metodo, si es no (1)
		// sera false
		int siono = JOptionPane.showConfirmDialog(null, "¿Tiene descuento?", precio, JOptionPane.YES_NO_OPTION);
		// 0=yes, 1=no

		if (siono == 0) {

			JOptionPane.showMessageDialog(null, calculo1.calcular(unidadesint, perciofloat, true));// muestro en un panel de dialogo el metodo 

		} else {

			JOptionPane.showMessageDialog(null, calculo1.calcular(unidadesint, perciofloat, false));

		}

	}

}
