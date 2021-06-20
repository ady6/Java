package com.act5;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		//referencia a una instancia de la interfaz Valor
		IValor miValor1;
		
		//uso lambda en un contexto de asignaci�n
		//asigno la expresi�n lambda a esa referencia de interfaz
		miValor1 = () -> 28.6;

		//lambda es compatible con getValor() porque, al igual que getValor(),
		//no tiene par�metros y devuelve un resultado double
		//tambi�n puedo declararla en un solo paso donde miValor2 se inicializa con la expresi�n lambda:
		IValor miValor2 = () -> 28.6;
		
		System.out.println("Un valor constante: " + miValor1.getValor());
		System.out.println("Un valor constante: " + miValor2.getValor());
		
		
	}

}
