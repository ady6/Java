package com.encapsulamiento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Coche {

	private String modelo;
	private Date fechaMatriculacion = new Date();
	private float precio;
	private Motor motor;//delegación de clases
	
	public Coche() {
		super();
		
	}

	public Coche(String modelo, Date fechaMatriculacion, float precio, Motor motor) {
		super();
		this.modelo = modelo;
		this.fechaMatriculacion = fechaMatriculacion;
		this.precio = precio;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFechaMatriculacion() {
		return new SimpleDateFormat("dd-MM-yyyy").format(fechaMatriculacion);
	}

	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", fechaMatriculacion=" + fechaMatriculacion + ", precio=" + precio
				+ ", motor=" + motor + "]";
	}
	
	
	
	
}//cierra clase
