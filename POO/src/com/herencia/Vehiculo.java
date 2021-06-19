package com.herencia;

public abstract class Vehiculo {
	//clase abstracta NO se puede instanciar
	
	private String matricula;
	
	public void arrancar() {
		
		System.out.println("arrancando");
	}
	
	//dos m�todos con el mismo nombre, y diferentes argumentos
	//tiene un nombre : sobrecarga
	
	public void aparcar(String tipo, String donde)//pasando un par�metro al m�todo
	{
		System.out.println("aparcando "+tipo+" en "+donde);
	}
	
	public void aparcar(String tipo)//pasando un par�metro al m�todo
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
