/*  En una clase tienes un número 25. Si el valor es >10, el mensaje es ok.
 * Si no, el mensaje es no ok. Lo realizas con operador ternario y con if/else.
*/

package com.practica;

public class Actividad4 {

	public static void main(String[] args) {
		
		String resultado = "Ok" ;
		String resultado2 = "No Ok" ;
		int num1 = 25;
		int num2 = 10;

		if (num1 > num2) {
			System.out.println (resultado);
		} else {
			System.out.println (resultado2);
		}

	}

}
