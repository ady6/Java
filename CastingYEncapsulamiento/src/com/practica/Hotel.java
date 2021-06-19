package com.practica;

import java.util.Date;

public class Hotel {

	private String fechaEntrada;
	private String fechaSalida;
	private String nombreCliente;
	private TipoHabitacion tipoHabitacion;//delegación de clases
	
	
	public Hotel() {
		super();
	}


	public Hotel(String fechaEntrada, String fechaSalida, String nombreCliente, TipoHabitacion tipoHabitacion) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.nombreCliente = nombreCliente;
		this.tipoHabitacion = tipoHabitacion;
	}


	public String getFechaEntrada() {
		return fechaEntrada;
	}


	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}


	public String getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}


	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}


	
	@Override
	public String toString() {
		return "Hotel [fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", nombreCliente="
				+ nombreCliente + "]";
	}
	
	
}
