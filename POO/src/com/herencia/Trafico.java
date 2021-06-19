package com.herencia;

public class Trafico {

	public static void main(String[] args) {
		
		Coche vw = new Coche();
		vw.repostar();
		vw.aparcar("en línea");
		
		Moto cbr = new Moto();
		cbr.derrapar();
		cbr.aparcar("en batería");//metodo heredado de vehiculo
		cbr.aparcar("en línea", "superficie");
	}

}
