package com.herencia;

public class Moto extends Vehiculo {
	
	public void derrapar()
	{
		System.out.println("estoy derrapando");
	}
	
	public void arrancar()//sobrescritura: la clase hija tiene un metodo que es igual que el de la clase padre
	{
		System.out.println("arrancando especialmente la moto");
	}

}
