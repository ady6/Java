package com.practica;

import com.encapsulamiento.Motor;

public class Checkin {

	public static void main(String[] args) {
		
		Hotel hotel1 = new Hotel();
		
		hotel1.setFechaEntrada("15-05-2021");
		hotel1.setFechaSalida("21-05-2021");
		hotel1.setNombreCliente("Juan L�pez");
		hotel1.setTipoHabitacion(new TipoHabitacion(50, "doble est�ndar"));
		
		System.out.println("�Gracias "+hotel1.getNombreCliente()+" por hacer su reserva!");
		System.out.println("Su entrada ser� el "+hotel1.getFechaEntrada()+" y su salida el "+hotel1.getFechaSalida());
		System.out.println("Su habitaci�n es la habitaci�n "+hotel1.getTipoHabitacion().getTipo()+" y la noche ser�n "+hotel1.getTipoHabitacion().getPrecio()+" euros");
		System.out.println("El importe total con IVA es de "+(hotel1.getTipoHabitacion().getPrecio()*1.18)+" euros");
	}

}
