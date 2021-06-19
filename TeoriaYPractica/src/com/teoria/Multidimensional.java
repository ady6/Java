package com.teoria;

public class Multidimensional {

	public static void main(String[] args) {
		
		float[][] notas=new float[3][5];
		
		notas[0][0]=(float) (Math.random()*10);
		notas[0][1]=6;
		notas[0][2]=6.7f;
		notas[2][2]=9;

		System.out.println(notas[0][0]);
		
		int [][] numeros = new int[2][3];
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <2; j++) {
			numeros[j][i]=(int)(Math.random()*10);
			System.out.println(numeros[j][i]);
			
			}
		}
	}
}
