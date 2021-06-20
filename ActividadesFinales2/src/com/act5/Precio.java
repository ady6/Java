package com.act5;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Precio {

	public static void main(String[] args) {
		
		float precio;
		
		//pregunta precio por panel
		String dato = JOptionPane.showInputDialog("Buenas, introduzca el precio del producto:");

		// parseo "dato" ya que es una cadena tomada del JOptionPane a float dentro de la variable "precio"
		precio = Float.parseFloat(dato);

		DecimalFormat formato = new DecimalFormat("#.0");
		String precioFormat=formato.format(precio);
		
		//muestro en un panel numero redondeado
		JOptionPane.showMessageDialog(null, ("Redondeado con Math.round: "+Math.round(precio)));
		JOptionPane.showMessageDialog(null, ("Redondeado con Math.ceil: "+Math.ceil(precio)));
		JOptionPane.showMessageDialog(null, ("Redondeado con Math.floor: "+Math.floor(precio)));
		JOptionPane.showMessageDialog(null, ("Redondeado con Format a un decimal: "+precioFormat));
		
	}

}
