package com.act1;

//clase Padre abstracta NO se puede instanciar
public abstract class Persona {

//propiedades privadas
	private String nombre;
	private String apellido;
	private int edad;
	private boolean casado;

//Constructor que pide las propiedades
	public Persona(String nombre, String apellido, int edad, boolean casado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.casado = casado;
	}

//Constructor "heredando" de Object
	public Persona() {
		super();

	}

//Encapsulamiento (getters/setters)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

//métodos
	public void hablar() {

		System.out.println("¡Soy una persona que está hablando!");
	}

	public void datospersona() {

		System.out.println("Mi nombre es " + nombre + " " + apellido + " tengo " + edad + " años");
	}

	public void estacasado() {
		if (casado == false) {
			System.out.println("No estoy casado");
		} else if (casado == true) {
			System.out.println("Estoy casado");
		}
	}

}
