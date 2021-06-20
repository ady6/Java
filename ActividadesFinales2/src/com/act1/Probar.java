package com.act1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//archivo java que instancia la clase
public class Probar {

	public static void main(String[] args) throws ParseException {

		// como fechaCaducidad es de tipo Date, a la hora de crear productos
		// voy a utilizar una variable donde introducir su fecha de caducidad
		// cambio el formato a dia/mes/año
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

		// creo las variables donde introducir las fechas de caducidad
		// aplicando el formato dia/mes/año
		Date caducidadManzana = formato.parse("15/03/2021");
		Date caducidadPera = formato.parse("21/03/2021");
		Date caducidadNaranja = formato.parse("20/03/2021");

		// creo los objetos
		Frutas manzana = new Frutas(100, 80, caducidadManzana, "Manzana", (float) 9.95);
		Frutas pera = new Frutas(150, 95, caducidadPera, "Pera", (float) 15.95);
		Frutas naranja = new Frutas(100, 75, caducidadNaranja, "Naranja", (float) 7.95);

		// muestro el total mediante el método implementado de la interfaz en la clase
		// Frutas

		System.out.println("Para las manzanas:");
		manzana.mostrarTotal();
		System.out.println("Para las peras:");
		pera.mostrarTotal();
		System.out.println("Para las naranjas:");
		naranja.mostrarTotal();

	}

}
