package com.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {

	public static void main(String[] args) {
		
		//colecci�n ordenada por clave sin repetici�n
		Map<String, Float> notas = new HashMap<String, Float>();
		notas.put("Bases de datos", 7.5f);
		notas.put("programaci�n", 4.2f);
		notas.put("sistemas inform�ticos", 3.75f);
		notas.put("programaci�n", 2.8f);
		
		//System.out.println("La nota es "+notas.get("programaci�n"));
		
		//no pq la posici�n NO es Map, sino la key
		for (int i = 0; i < args.length; i++) {
			
		}
		Set<String> asignaturas = notas.keySet();//saca todas las key
		for (String asignatura : asignaturas) {
			System.out.println("la nota es "+notas.get(asignatura));
		}
		
	}

}
