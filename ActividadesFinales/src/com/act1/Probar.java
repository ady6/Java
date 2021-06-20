package com.act1;

// archivo java que instancia la clase
public class Probar {

	public static void main(String[] args) {

		// objeto Profesor llamado profesor1
		Profesor profesor1 = new Profesor();
		profesor1.setNombre("Juan");
		profesor1.setApellido("Sánchez");
		profesor1.setEdad(54);
		profesor1.setCasado(true);

		// Pruebo los métodos
		profesor1.datospersona();// metodo heredado de persona
		profesor1.hablar();// metodo heredado de profesor específicamente
		profesor1.dondetrabaja("Hélicon", "Valdemoro");
		profesor1.dondetrabaja("España");
		profesor1.estacasado();

		// compruebo que si cambio la propiedad de tipo booleano a "false" va a
		// funcionar
		profesor1.setCasado(false);
		profesor1.estacasado();

	}

}
