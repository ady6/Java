package com.polimorfismo;

public class Gato extends Animal {
	
	public Gato(String nombre) {
		super(nombre);
	}
	
	@Override
	public void tipoAnimal() {
		System.out.println("Soy un gato");
	}
	
	
	public void comunicarse() {
	System.out.println("El gato dice miau");	
		
	}
	
	public void soloGatos() {
		System.out.println("Solos los gatos");
	}
	
}

