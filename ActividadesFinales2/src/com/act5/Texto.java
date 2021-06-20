package com.act5;

public class Texto {

	public static void main(String[] args) {

		// introduzco el texto en una variable
		String texto = "Estoy haciendo un examen";

		// mayusculas
		System.out.println("Texto en mayúsculas: " + texto.toUpperCase());

		// aes por ies
		System.out.println("Texto cambiando aes por ies: " + texto.replaceAll("a", "i"));

		// caracteres
		System.out.println("Número de caracteres en el texto: " + (texto.length()));

	}

}
