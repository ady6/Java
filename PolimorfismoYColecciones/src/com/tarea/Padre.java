package com.tarea;

import java.time.LocalDate;

public abstract class Padre {//clase abstracta NO se puede instanciar

	public int sumar(int x, int y) {
		return x+y;
	}
	public int sumar(int x, int y, int z) {//sobrecarga
		return x+y+z;
	}
	public int restar(int x, int y) {
		return x-y;
	}
	public long diasHastaAlta(LocalDate inicio, LocalDate fin) {
		return DAYS.between(inicio, fin);
		
	}
}


