package com.encapsulamiento;

import java.util.Date;

public class Probar {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		coche1.setModelo("seat panda");
		System.out.println("coche elegido "+coche1.getModelo());
		coche1.setFechaMatriculacion(new Date());
		System.out.println("Matriculado el "+coche1.getFechaMatriculacion());
		coche1.setPrecio(18000);
		System.out.println("PVP "+coche1.getPrecio()*1.21 + " euros");
		coche1.setMotor(new Motor("diesel", 1000));
		System.out.println("Motor "+coche1.getMotor().toString());
		System.out.println("Horas de motor "+coche1.getMotor().getHoras());
		System.out.println("Duración estimada en años "+coche1.getMotor().duracion());
	
		
		
	}//main

}//class
