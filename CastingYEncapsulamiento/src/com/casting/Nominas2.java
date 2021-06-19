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
		
		System.out.println("Liquidación de nómina ");
		System.out.println("Total devengado "+ doubleSalario);
		System.out.println("Total cotización "+ doubleCotizacion);
		System.out.println("Total retención IRPF "+ doubleRetencion);
		System.out.println("Líquido a percibir "+ doubleSalarioNeto);
	}//main

}//class
