package com.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : colección de objetos sin orden y sin repetición
public class Conjunto {

	public static void main(String[] args) {
		
		Set<Float> precios = new HashSet<Float>();
		precios.add(14.5f);
		precios.add(85.65f);
		precios.add(74.58f);
		
	System.out.println("total de elementos "+precios.size());
	
	//NO puedo porque el for sólo sirve para recorrer x ordenados, pero set es desordenado
	for (int i = 0; i < precios.size(); i++) {
		System.out.println("el precio es "+precios);
	}

	for (Float precio : precios) {
		System.out.println("el precio es "+precio);
	}
	
	for (Iterator iterator = precios.iterator(); iterator.hasNext();) {
		Float float1 = (Float) iterator.next();
		System.out.print("el precio es con iterator "+precios);
	}
	
	}//cierra main

}//cierra clase
