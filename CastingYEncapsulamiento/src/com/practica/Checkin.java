package com.practica;

import com.encapsulamiento.Motor;

public class Checkin {

	public static void main(String[] args) {
		
		Hotel hotel1 = new Hotel();
		
		hotel1.setFechaEntrada("15-05-2021");
		hotel1.setFechaSalida("21-05-2021");
		hotel1.setNombreCliente("Juan López");
		hotel1.setTipoHabitacion(new TipoHabitacion(50, "doble estándar"));
		
		System.out.println("¡Gracias "+hotel1.getNombreCliente()+" por hacer su reserva!");
		System.out.println("Su entrada será el "+hotel1.getFechaEntrada()+" y su salida el "+hotel1.getFechaSalida());
		System.out.println("Su habitación es la habitación "+hotel1.getTipoHabitacion().getTipo()+" y la noche serán "+hotel1.getTipoHabitacion().getPrecio()+" euros");
		System.out.println("El importe total con IVA es de "+(hotel1.getTipoHabitacion().getPrecio()*1.18)+" euros");
	}

}
