package Controlador;

import java.util.List;
import java.util.Scanner;

public class Arreglo_Nombre {

	public static void main(String[] args) {
		var lt = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de nombres: ");
		var cantidad = lt.nextInt();
		
		var nombres = new String[cantidad];
		
		lt.nextLine();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese el nombre " + (i + 1) + ": ");
			nombres[i] = lt.nextLine();			
		}
		
		var mayorCaracteres = nombres[0];
		
		for (int i = 1; i < cantidad; i++) {
			if(nombres[i].length() > mayorCaracteres.length()) {
				mayorCaracteres = nombres[i];
			}
			
		}
		
		System.out.println("El nombre com mayor cantidad de caracteres es: " + mayorCaracteres);
	}

}
