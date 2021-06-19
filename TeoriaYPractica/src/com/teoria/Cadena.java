package com.teoria;

public class Cadena {
	
	public static void main(String[] args) {
		
		String mensaje="En un lugar \nde la mancha";
		
		System.out.println(mensaje);
		System.out.println(mensaje.toUpperCase());
		System.out.println(mensaje.length());
		
		
		//mostrar los 10 primeros caracteres
		
		String sSubmensaje = mensaje.substring(0,10);
		System.out.println(sSubmensaje);
		
		
		//dime ok si está la palabra quijote

		System.out.println(mensaje.contains("quijote"));
		
		
		//cambia las a por i
		
		String resultado = mensaje.replace('a','i');
		System.out.println(resultado);
		
		
		//muestra el texto al revés
		
		StringBuilder builder=new StringBuilder(mensaje);
		String sCadenaInvertida=builder.reverse().toString();
		System.out.println(sCadenaInvertida);
		
	}
	

}//cierra clase
