package com.herencia;

public class Trafico {

	public static void main(String[] args) {
		
		Coche vw = new Coche();
		vw.repostar();
		vw.aparcar("en l�nea");
		
		Moto cbr = new Moto();
		cbr.derrapar();
		cbr.aparcar("en bater�a");//metodo heredado de vehiculo
		cbr.aparcar("en l�nea", "superficie");
	}

}
