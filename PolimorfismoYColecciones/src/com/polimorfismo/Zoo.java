package com.polimorfismo;

public class Zoo {

	public static void main(String[] args) {
		
		Perro perro = new Perro();//herencia
		perro.comer();
		perro.correr();
		perro.saltar();
		
		Animal perro1=new Perro();//polimorfismo
		perro1.comer();
		perro1.correr();//este m�todo es del Perro pero por sobrecarga
		//no puedes llamar a m�todos "exclusivos" del perro

	}

}
