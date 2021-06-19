package com.casting;

import javax.swing.JOptionPane;

public class Nominas {

	public static void main(String[] args) {
		
		String stringSalario = JOptionPane.showInputDialog("Introduzca el salario bruto");
		float floatSalario = Float.parseFloat(stringSalario);
		float floatCCC = 0.047f;
		float floatCP = 0.025f;
		float floatIRPF = 0.02f;
		
		float floatCotizacion = (floatCCC*floatSalario) + (floatCP*floatSalario);
		float floatRetencion = floatIRPF * floatSalario;
		
		float floatSalarioNeto = floatSalario - floatCotizacion - floatRetencion;
		
		System.out.println("Liquidación de nómina ");
		System.out.println("Total devengado "+ floatSalario);
		System.out.println("Total cotización "+ floatCotizacion);
		System.out.println("Total retención IRPF "+ floatRetencion);
		System.out.println("Líquido a percibir "+ floatSalarioNeto);
	}//main

}//class
