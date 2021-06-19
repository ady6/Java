package com.teoria;

public class MetodosArrays {

	public static void main(String[] args) {
		
		float[] temperaturas= {15.5f, 7.6f, 9.4f, 26.5f};
		float total=0;
		int numero=temperaturas.length;
		System.out.println(numero);
		
		for (int i = 0; i < numero; i++) {                                    
			float f = temperaturas[i];
			total+=f;
			System.out.println(f);
			
		}
		
		System.out.println("promedio de temperaturas " +(total/numero));

	}

}
