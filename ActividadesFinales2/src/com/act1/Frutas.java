package com.act1;

import java.util.Date;

//clase hija que hereda de Supermercado (clase padre) e implementa la interfaz
public class Frutas extends Supermercado implements ITotal {

	// propiedades propias
	private String nombreProducto;
	private float precioUnitario;

	// constructor que pide las propiedades
	public Frutas(int unidadesenStock, int unidadesenPedido, Date fechaCaducidad, String nombreProducto,
			float precioUnitario) {
		super(unidadesenStock, unidadesenPedido, fechaCaducidad);
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
	}

	// encapsulamiento (getters/setters)
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	// método toString
	@Override
	public String toString() {
		return "Frutas [nombreProducto=" + nombreProducto + ", precioUnitario=" + precioUnitario + "]";
	}

	// método de la interfaz
	@Override
	public void mostrarTotal() {

		int total = (int) ((getUnidadesenStock() - getUnidadesenPedido()) * getPrecioUnitario());
		System.out.println("el total de inventario es de: " + total + " euros.");

	}

}
