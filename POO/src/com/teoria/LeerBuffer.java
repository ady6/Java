package com.teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerBuffer {

	public static void main(String[] args) throws IOException {
		
		System.out.println("dime la capital de Italia");
		final String capitalCorrecta="roma";
		String capitalRespuesta="";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		capitalRespuesta=in.readLine();
		System.out.println("tu respuesta ha sido "+capitalRespuesta);
		float puntos=(capitalCorrecta.equalsIgnoreCase(capitalRespuesta))?1:-0.125f;
		System.out.println("has obtenido "+puntos+" puntos");
	}

}
