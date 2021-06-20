//archivo java con método 
package com.act3;

public class Calculos {

	// propiedades de la clase
	private int unidades;
	private float precio;
	boolean descuento;

	// constructor
	public Calculos() {
		super();
	}

	// getters y setters
	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	// método que pide unidades, precio y descuento
	public String calcular(int unidades, float precio, boolean descuento) {

		float precioud = (precio * unidades);// precio total sin descuento
		float desc = (precioud * 15) / 100;// dinero que se descuenta
		float preciototal = precioud - desc;// precio total con descuento

		if (descuento == true) {// condición para mostrar precio total con o sin descuento
			return "El precio total con descuento incluido es de " + preciototal + " euros, gracias por su compra";
		} else {
			return "El precio total es de " + precioud + " euros, gracias por su compra";
		}

	}

}
