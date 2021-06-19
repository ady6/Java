package com.encapsulamiento;

public class Motor {
	
	private String tipo;
	private int horas;
	
	
	
	public Motor() {
		super();
		
	}



	public Motor(String tipo, int horas) {
		super();
		this.tipo = tipo;
		this.horas = horas;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	public int duracion() {
		return 10;//duracion en años
	}



	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", horas=" + horas + "]";
	}
	
	

}
