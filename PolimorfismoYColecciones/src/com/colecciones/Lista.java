package com.colecciones;

import java.util.ArrayList;import java.util.Iterator;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		//colecci�n ordenada de elementos que soporta duplicados
		List<String> productos=new ArrayList<String>();//polimorfismo con interfaces
		productos.add("camisa");
		productos.add("pantal�n");
		productos.add("sombrero");
		productos.add("pantal�n");
		
		System.out.println("en la segunda posici�n es "+productos.get(1));
		System.out.println("total de elementos "+productos.size());

		productos.remove(1);
		
		System.out.println("en la segunda posici�n es "+productos.get(1));
		System.out.println("total de elementos "+productos.size());
		
		for (int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i));
		}
		
		for (String producto : productos) {
			System.out.println(producto+"-");
		}
		
		for (Iterator iterator = productos.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string+"/");
		}
		
		
	}//cierra main

}//cierra class
