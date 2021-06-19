package com.polimorfismo;

public class Zoo {

	public static void main(String[] args) {
		
		Perro perro = new Perro();//herencia
		perro.comer();
		perro.correr();
		perro.saltar();
		
		Animal perro1=new Perro();//polimorfismo
		perro1.comer();
		perro1.correr();//este método es del Perro pero por sobrecarga
		//no puedes llamar a métodos "exclusivos" del perro

	}

}
