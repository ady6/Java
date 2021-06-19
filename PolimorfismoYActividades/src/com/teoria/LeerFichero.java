package com.teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {

		File archivo = new File("C:\\Users\\Campus FP\\Desktop\\quijote.txt");
		try {
			FileReader fr = new FileReader(archivo);
			// System.out.println(fr.read());
			BufferedReader br = new BufferedReader(fr);
			String linea;
			StringBuilder sb = new StringBuilder();
			while ((linea = br.readLine()) != null) {
				sb.append(linea + "\n");
			}
			System.out.println(sb);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
