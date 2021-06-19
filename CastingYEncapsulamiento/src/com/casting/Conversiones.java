package com.casting;

import javax.swing.JOptionPane;

public class Conversiones {

	public static void main(String[] args) {
	
		float floatPrecio = 15.95f;
		int intPrecio = (int) floatPrecio;
		System.out.println(floatPrecio);//casting
		System.out.println(intPrecio);
		
		float floatSubtotal = 1523.95f;
		double doubleSubtotal = floatSubtotal;//conversion implícita
		System.out.println(floatSubtotal);
		System.out.println(doubleSubtotal);

		String stringEdad="18";
		int intEdad;
		intEdad = Integer.valueOf(stringEdad);
		System.out.println(intEdad*2);
		
		String stringDato = JOptionPane.showInputDialog("Dime tu salario");
		float floatSalario = Float.valueOf(stringDato);//valueOf
		float floatSalario2 = Float.parseFloat(stringDato);//parse
		System.out.println("Tu salario es "+Math.round(floatSalario*0.9));
		System.out.println("Tu salario es "+Math.round(floatSalario2*0.9));
		
	
		
		
		
	}//main

}//class
