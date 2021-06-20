package com.act3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import java.util.Set;

public class AlmacenCiudades {

	public static void main(String[] args) {

		// utilizo ArrayList ya que es una colecci�n ordenada de elementos que soporta
		// duplicados
		List<String> ciudades = new ArrayList<String>();
		ciudades.add("Madrid");
		ciudades.add("Sevilla");
		ciudades.add("Madrid");
		ciudades.add("Valencia");
		ciudades.add("Sevilla");
		ciudades.add("Madrid");

		// muestro por consola el listado ordenado con un salto de l�nea por ciudad
		for (Iterator iterator = ciudades.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + "\n");
		}

		// a�ado una nueva ciudad
		ciudades.add("C�rdoba");

		// elimino Valencia
		ciudades.remove(3);

		// vuelvo a mostrar los datos por consola esta vez separ�ndolos con un doble
		// espacio
		for (Iterator iterator = ciudades.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + "  ");
		}

		System.out.println("\n\nOtro ejercicio:\n");

		// vuelvo a utilizar ArrayList
		List<String> ciudades2 = new ArrayList<String>();
		ciudades2.add("Madrid, 50");
		ciudades2.add("Sevilla, 40");
		ciudades2.add("Madrid, 35");
		ciudades2.add("Valencia, 81");

		// lo muestro ordenado separ�ndolos con un doble espacio
		for (Iterator iterator = ciudades2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + "  ");
		}

		// utilizo el color azul en un ejemplo
		// Meto en variable tipo Colores al color azul del enumerador
		Colores color1 = Colores.azul;

		// muestro en un panel un mensaje sobre el color
		JOptionPane.showMessageDialog(null, "El color " + color1 + " es muy bonito");

	}

}
