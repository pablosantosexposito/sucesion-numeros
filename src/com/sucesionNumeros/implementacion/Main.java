package com.sucesionNumeros.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final List<String> CENTRALNUMBERS = new ArrayList<>();
	private static BufferedReader br;

	public static void main(String[] args) {

		fillCentralNumbers();

		System.out.println(CENTRALNUMBERS);

	}

	static void fillCentralNumbers() {

		try {
			br = new BufferedReader(new FileReader(new File("E:\\ProyectosEclipse\\sucesionNumeros\\Additions\\CentralNumbers.txt")));

			String linea;

			while ((linea = br.readLine()) != null) {
				CENTRALNUMBERS.add(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo en la ruta especificada");
		} catch (IOException e) {
			System.out.println("Error en la entrada o salida de los datos");
		}
	}

}
