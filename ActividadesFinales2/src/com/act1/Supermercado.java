package com.act1;

import java.util.Date;

//clase Padre abstracta NO se puede instanciar
public abstract class Supermercado {

	// propiedades privadas
	private int unidadesenStock;
	private int unidadesenPedido;
	private Date fechaCaducidad;

	// constructor que pide las propiedades
	public Supermercado(int unidadesenStock, int unidadesenPedido, Date fechaCaducidad) {
		super();
		this.unidadesenStock = unidadesenStock;
		this.unidadesenPedido = unidadesenPedido;
		this.fechaCaducidad = fechaCaducidad;
	}

	// encapsulamiento (getters/setters)
	public int getUnidadesenStock() {
		return unidadesenStock;
	}

	public void setUnidadesenStock(int unidadesenStock) {
		this.unidadesenStock = unidadesenStock;
	}

	public int getUnidadesenPedido() {
		return unidadesenPedido;
	}

	public void setUnidadesenPedido(int unidadesenPedido) {
		this.unidadesenPedido = unidadesenPedido;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	// método toString
	@Override
	public String toString() {
		return "Supermercado [unidadesenStock=" + unidadesenStock + ", unidadesenPedido=" + unidadesenPedido
				+ ", fechaCaducidad=" + fechaCaducidad + "]";
	}

}
