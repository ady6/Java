/* La lista de la compra es :
zanahorias, leche, zumo de naranja, huevos y manzanas.
Muestra la lista de la compra.
Cambia manzanas por plátanos.
Añade colifror.
*/

package com.practica;

import java.util.ArrayList;
import java.util.List;

public class Actividad2 {

	public static void main(String[] args) {
		
		List<String> compra=new ArrayList<String>();
		compra.add("zanahorias");
		compra.add("leche");
		compra.add("zumo de naranja");
		compra.add("huevos");
		compra.add("manzanas");
		
		System.out.println("total de elementos "+compra.size());

		compra.add("coliflor");

	}

}
