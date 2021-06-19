package com.teoria;

import com.banco.MediosPagoFísico;

//conectarla con una base de datos : persistencia de datos
//CRUD : create, read, update, delete
//POJO
public class Cliente {

	//atributos, propiedades, variables
	
	private String nombre;
	private String ciudad;
	private float facturacion;
	private boolean descuento;

	
	
	//constructor
	//@Entity(Table="Clientes")
	public Cliente(String nombre, String ciudad, float facturacion, boolean descuento) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.facturacion = facturacion;
		this.descuento = descuento;
	}
	
	
	//métodos
	
	public void vender() {
		System.out.println("le estoy vendiendo");
	}


	//public accesible siempre, private accesible solo en su clase,
	//protected accesible si estan en el mismo paquete
	
	public void cobrar()
	{
		System.out.println("David vas a cobrar");
		MediosPagoFísico medio = new MediosPagoFísico();
		medio.tarjeta();
	}
	
	//getters y setters
	//get son read - select
	//setters son update / delete
	
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
	public float getFacturacion() {
		return facturacion;
	}
	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}	
	
}
