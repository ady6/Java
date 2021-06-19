package com.polimorfismo;

public class Probar {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		
		Gato gato = new Gato("gato1");
		gato.soloGatos();
		gato.tipoAnimal();
		gato.comunicarse();
		
		Perro perro = new Perro("perro1");
		perro.tipoAnimal();
		
		System.out.println("-----------");
		
		Animal animalGato = new Gato("gato2");//polimorfismo
		Animal animalPerro = new Perro("perro2");
		
		animalGato.tipoAnimal();
		//animalGato.soloGatos no se puede, solo métodos de animal que son gatos
		System.out.println("-----------");
		animalGato.comunicarse();
		animalGato = new Perro("ahora perro");
		animalGato.tipoAnimal();
		
		/*
		 el nombre es gato2
		 el nombre es perro2
		 soy un gato
		 el nombre es ahora perro
		 soy un lindo perrito
		 */
		
		

	}

}
