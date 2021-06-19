package com.teoria;

public class TiposArray {

	public static void main(String[] args) {
	
	try {
	int[] unidades=new int[10];
	unidades[0]=15;
	unidades[1]=20;
	unidades[5]=25;
	unidades[9]=30;
	
	System.out.println(unidades[1]);
	}
	catch (Exception e) {
		System.out.println("Error por algo"+e.getMessage() );
	}
	System.out.println("Fin del programa");
	
	}//cierra main

}//cierra class
