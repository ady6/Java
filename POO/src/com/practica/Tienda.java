/*
 * 1. qué significa pojo
 * POJO: instancia de una clase que no extiende ni implementa nada en especial
 * "Plain Old Java Object"
 * 2. crea una clase "ejecutable" llamada tienda. Esta  clase crea un nuevo cliente con nombre, ciudad, email.
 * El cliente es una clase tipo pojo en Java.
 */

package com.practica;

	public class Tienda {

		public static void main(String[] args) {
				
			Cliente cliente = new Cliente("Adaya","Madrid","adaya.valero@campusfp.es"); //insert
			
			System.out.println(cliente.toString());
			
			// 3. Actualiza la ciudad del cliente usando los setters.
			cliente.setCiudad("Málaga");
			
			System.out.println("La ciudad del cliente "+cliente.getNombre()+" se ha actualizado a: "+cliente.getCiudad());
			
			// 4. Elimina el mail de un cliente. Lo puedes hacer con setters.
			cliente.setEmail(null);
			
			System.out.println("La ciudad del cliente "+cliente.getNombre()+" se ha actualizado a: "+cliente.getEmail());
		
			// 5. Muestra los datos del cliente en consola. Utiliza toString.
			
			System.out.println(cliente.toString());
		
		}

	}
