package com.practica;

public class Cliente {

	
	//atributos, propiedades, variables
	private String nombre;
	private String ciudad;
	private String email;

	
	//constructor
	public Cliente(String nombre, String ciudad, String email) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.email = email;
	}
	

	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//toString
	public String toString (){
        String datos="El cliente se llama "+nombre+", vive en "+ciudad+" y su email es " +email;
        return datos;
    }
	
}
