package com.teoria;

import java.util.Scanner;

public class Concurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Concurso. 5 intentos por pregunta");
		int puntos=5;
		int puntosGlobales=0;
		int intentos=5;
		//Pregunta 1
		while(intentos<=5 && intentos>0) {//abre while
		for(int i=0;i<5;i++) {//abre for
			
		System.out.println("�Cu�l es la capital de Italia?");
		String respuesta="";
		Scanner sc = new Scanner(System.in);
		respuesta=sc.nextLine();
		System.out.println("Su respuesta es "+respuesta);
		
		
		if(respuesta.equalsIgnoreCase("roma")) {
			
			System.out.println("Puntuaci�n "+puntos);
			puntosGlobales+=puntos;
			puntos=5;
			intentos=6;
			break;
			//System.exit(0);
		}
		else {
			System.out.println("Puntuaci�n "+ (--puntos));
			intentos--;
			System.out.println("te quedan "+intentos);
			if(intentos==0)
			{
				//break;
				
				System.out.println("Fin de juego");
				System.out.println("Puntuaci�n Total "+ puntosGlobales);
				System.exit(0);
			}
			
		}
		}//cierra for
		}//cierra while
		
		//Pregunta 2
		intentos=5;
		while(intentos<=5 && intentos>0) {//abre while
				for(int i=0;i<5;i++) {//abre for
				
				System.out.println("�Cu�l es la capital de Francia?");
				String respuesta="";
				Scanner sc = new Scanner(System.in);
				respuesta=sc.nextLine();
				System.out.println("Su respuesta es "+respuesta);
				
				
				if(respuesta.equalsIgnoreCase("paris")||respuesta.equalsIgnoreCase("par�s")) {
					
					System.out.println("Puntuaci�n "+puntos);
					puntosGlobales+=puntos;
					puntos=5;
					intentos=6;
					break;
					//System.exit(0);
				}
				else {
					System.out.println("Puntuaci�n "+ (--puntos));
					System.out.println("te quedan "+intentos);
					intentos--;
					if(intentos==0)
					{
						break;
					}
				}
				}//cierra for
		}//cierra while
		
				
			
		
	}//cierra main

}//cierra class
