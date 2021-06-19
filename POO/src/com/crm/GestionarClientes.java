package com.crm;

import com.teoria.Cliente;

public class GestionarClientes {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("juan","madrid",1000.95f,false);//insert
		
		System.out.println("estamos gestionando a "+cliente.getNombre());
		
		cliente.vender();
		
		System.out.println("Facturación anual "+cliente.getFacturacion()+ " euros");
		
		cliente.setNombre("maría");//setter - update
		
		System.out.println("Nuevo nombre "+cliente.getNombre());
		
		cliente.cobrar();
	}

}
