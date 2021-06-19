package com.herencia;

public abstract class Vehiculo {
	//clase abstracta NO se puede instanciar
	
	private String matricula;
	
	public void arrancar() {
		
		System.out.println("arrancando");
	}
	
	//dos métodos con el mismo nombre, y diferentes argumentos
	//tiene un nombre : sobrecarga
	
	public void aparcar(String tipo, String donde)//pasando un parámetro al método
	{
		System.out.println("aparcando "+tipo+" en "+donde);
	}
	
	public void aparcar(String tipo)//pasando un parámetro al método
	{
		System.out.println("aparcando "+tipo);
	}
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
