package com.casting;

import javax.swing.JOptionPane;

public class Nominas2 {

	public static void main(String[] args) {
		
		String stringSalario = JOptionPane.showInputDialog("Introduzca el salario bruto");
		double doubleSalario = Double.parseDouble(stringSalario);
		double doubleCCC = 0.047;
		double doubleCP = 0.025;
		double doubleIRPF = 0.02;
		
		double doubleCotizacion = (doubleCCC*doubleSalario) + (doubleCP*doubleSalario);
		double doubleRetencion = doubleIRPF * doubleSalario;
		
		double doubleSalarioNeto = doubleSalario - doubleCotizacion - doubleRetencion;
		
		System.out.println("Liquidaci�n de n�mina ");
		System.out.println("Total devengado "+ doubleSalario);
		System.out.println("Total cotizaci�n "+ doubleCotizacion);
		System.out.println("Total retenci�n IRPF "+ doubleRetencion);
		System.out.println("L�quido a percibir "+ doubleSalarioNeto);
	}//main

}//class
