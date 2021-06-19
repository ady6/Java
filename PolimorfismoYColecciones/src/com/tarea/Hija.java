package com.tarea;

public class Hija extends Padre implements Interface {//herencia

	public double raiz(double x) {
		return Math.sqrt(x);
	}

@Override
public boolean comprobar(String dato) {
	return false;
}

	public boolean chequear (String tarjeta) {
		return tarjeta.matches("([0-9]{4}\\s){3}[0-9]{4}"); 
	}
}


