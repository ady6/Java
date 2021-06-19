package com.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {

	public static void main(String[] args) {
		
		//colección ordenada por clave sin repetición
		Map<String, Float> notas = new HashMap<String, Float>();
		notas.put("Bases de datos", 7.5f);
		notas.put("programación", 4.2f);
		notas.put("sistemas informáticos", 3.75f);
		notas.put("programación", 2.8f);
		
		//System.out.println("La nota es "+notas.get("programación"));
		
		//no pq la posición NO es Map, sino la key
		for (int i = 0; i < args.length; i++) {
			
		}
		Set<String> asignaturas = notas.keySet();//saca todas las key
		for (String asignatura : asignaturas) {
			System.out.println("la nota es "+notas.get(asignatura));
		}
		
	}

}
