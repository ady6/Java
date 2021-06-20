/* 1. Tenemos 5 centros : Atocha, Alcalá de henares, Humanes, Getafe y Arganda
2. La nota media en cada centro para grados superior fue : 7.5 - 6.5 - 9.5 - 4.5 - 6.7
3. Muestra las notas medias obtenidas en cada centro 
4. Muestra la nota media total de todos los centros
5. Añade un nuevo centro : Leganés. Su nota media fue 5.8
*/

package com.practica;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Actividad1 {

	public static void main(String[] args) {
		
		float suma=0;
		
		Map<Centros, Float> notas = new HashMap<Centros, Float>();
		notas.put(Centros.Atocha, 7.5f);
		notas.put(Centros. Alcala_de_henares, 6.5f);
		notas.put(Centros.Humanes, 9.5f);
		notas.put(Centros.Getafe, 4.5f);
		notas.put(Centros.Arganda, 6.7f);

		
		// no puedo con FOR porque la posición NO es Map, sino la key
		
		
		Set<Centros> medias = notas.keySet();// saca todas las key
		for (Centros media : medias) {
			System.out.println("La nota media del centro de " + notas.get(media) + " es " + notas.get(media));
		}
	
		
		System.out.println("La nota media de todos los centros es ");
		
	}

}
