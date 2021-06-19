package com.practica;

import java.util.*;

public class Actividad4 {

	public static void main(String[] args) {

		Calendar fecha = new GregorianCalendar();

		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);

		System.out.println("La fecha actual es: " + dia + "/" + (mes + 1) + "/" + año);

		System.out.println("Y la hora actual es: " + hora + ":" + minuto);

	}

}
