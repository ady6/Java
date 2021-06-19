package com.polimorfismo;

public class Perro extends Animal {

	public Perro(String nombre) {
		
		super(nombre);
	}

	@Override
	public void tipoAnimal() {
		System.out.println("Soy unlindo perrito");
	}
	
	
	public void comunicarse() {
	System.out.println("El perro dice guau");	
		
	}
	

}
