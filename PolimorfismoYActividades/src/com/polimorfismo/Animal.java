package com.polimorfismo;

public abstract class Animal implements IAnimal{

	private String nombre;//propiedad
	
	
	
	public Animal(String nombre) {//constructor
		super();
		this.nombre = nombre;
		System.out.println("el nombre es "+nombre);
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void tipoAnimal();

	@Override
	public void comunicarse() {
		
		
	}

}
