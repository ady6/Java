package com.act6;

import javax.swing.JOptionPane;

public class Probar {

	public static void main(String[] args) {

		// Meto en variables tipo Ciudad a todas las ciudades del enumerador
		Ciudad ciudad1 = Ciudad.Sevilla;
		Ciudad ciudad2 = Ciudad.Madrid;
		Ciudad ciudad3 = Ciudad.Málaga;
		Ciudad ciudad4 = Ciudad.Cádiz;
		Ciudad ciudad5 = Ciudad.Barcelona;
		Ciudad ciudad6 = Ciudad.Granada;
		Ciudad ciudad7 = Ciudad.Alicante;
		Ciudad ciudad8 = Ciudad.Almería;
		Ciudad ciudad9 = Ciudad.Toledo;
		Ciudad ciudad10 = Ciudad.Valencia;

		// Array que contiene las variables declaradas antes
		Object[] ciudades = { ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6, ciudad7, ciudad8, ciudad9,
				ciudad10 };

		// JOptionPane que da la bienvenida y da a elegir entre las variables del array
		Object opcion = JOptionPane.showInputDialog(null, "¡Bienvenid@ a AdayaAirlines! \n¿A qué ciudad desea viajar?",
				"Elegir", JOptionPane.QUESTION_MESSAGE, null, ciudades, ciudades[0]);

		// Según la ciudad elegida, se mostrará un mensaje distinto
		if (opcion.toString().equalsIgnoreCase("Sevilla") || opcion.toString().equalsIgnoreCase("Málaga")
				|| opcion.toString().equalsIgnoreCase("Cádiz") || opcion.toString().equalsIgnoreCase("Granada")
				|| opcion.toString().equalsIgnoreCase("Almería")) {
			JOptionPane.showMessageDialog(null,
					"Su viaje a " + opcion + " está listo, disfrute de esta bonita ciudad de Andalucía");
		} else if (opcion.toString().equalsIgnoreCase("Madrid") || opcion.toString().equalsIgnoreCase("Barcelona")) {
			JOptionPane.showMessageDialog(null, "Su viaje a " + opcion + " está listo, disfrute de esta gran ciudad");
		} else {
			JOptionPane.showMessageDialog(null, "Su viaje a " + opcion + " está listo, disfrute de sus vacaciones");
		}
	}

}
