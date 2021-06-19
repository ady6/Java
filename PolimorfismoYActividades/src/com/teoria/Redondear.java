package com.teoria;

import java.text.DecimalFormat;

public class Redondear {

	public static void main(String[] args) {
		
		float n1 = 5.123456f;
		double n2 = 5.123456;
		
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println("Math.round");
		System.out.println(Math.round(n1));
		System.out.println(Math.round(n2));
		
		System.out.println("Math.floor");
		System.out.println(Math.floor(n1));
		System.out.println(Math.floor(n2));

		System.out.println("Math.ceil");
		System.out.println(Math.ceil(n1));
		System.out.println(Math.ceil(n2));
		
		System.out.println("Con Format");
		DecimalFormat formato = new DecimalFormat("#.000");
		String numeroDecimal=formato.format(n1);
		System.out.println(numeroDecimal);
		System.out.println(formato.format(n2));

	}//cierro main

}//cierro class
