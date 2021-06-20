package com.act6;

import javax.swing.JOptionPane;

public class Probar {

	public static void main(String[] args) {

		// Meto en variables tipo Ciudad a todas las ciudades del enumerador
		Ciudad ciudad1 = Ciudad.Sevilla;
		Ciudad ciudad2 = Ciudad.Madrid;
		Ciudad ciudad3 = Ciudad.M�laga;
		Ciudad ciudad4 = Ciudad.C�diz;
		Ciudad ciudad5 = Ciudad.Barcelona;
		Ciudad ciudad6 = Ciudad.Granada;
		Ciudad ciudad7 = Ciudad.Alicante;
		Ciudad ciudad8 = Ciudad.Almer�a;
		Ciudad ciudad9 = Ciudad.Toledo;
		Ciudad ciudad10 = Ciudad.Valencia;

		// Array que contiene las variables declaradas antes
		Object[] ciudades = { ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6, ciudad7, ciudad8, ciudad9,
				ciudad10 };

		// JOptionPane que da la bienvenida y da a elegir entre las variables del array
		Object opcion = JOptionPane.showInputDialog(null, "�Bienvenid@ a AdayaAirlines! \n�A qu� ciudad desea viajar?",
				"Elegir", JOptionPane.QUESTION_MESSAGE, null, ciudades, ciudades[0]);

		// Seg�n la ciudad elegida, se mostrar� un mensaje distinto
		if (opcion.toString().equalsIgnoreCase("Sevilla") || opcion.toString().equalsIgnoreCase("M�laga")
				|| opcion.toString().equalsIgnoreCase("C�diz") || opcion.toString().equalsIgnoreCase("Granada")
				|| opcion.toString().equalsIgnoreCase("Almer�a")) {
			JOptionPane.showMessageDialog(null,
					"Su viaje a " + opcion + " est� listo, disfrute de esta bonita ciudad de Andaluc�a");
		} else if (opcion.toString().equalsIgnoreCase("Madrid") || opcion.toString().equalsIgnoreCase("Barcelona")) {
			JOptionPane.showMessageDialog(null, "Su viaje a " + opcion + " est� listo, disfrute de esta gran ciudad");
		} else {
			JOptionPane.showMessageDialog(null, "Su viaje a " + opcion + " est� listo, disfrute de sus vacaciones");
		}
	}

}
