package Controlador;

import java.util.List;
import java.util.Scanner;

public class Arreglo_Nombre {

	public static void main(String[] args) {
		var lt = new Scanner(System.in);
		/*Realizar un programa en java que permita leer un arreglo de nombres.
		 *Al final mostrar el nombre con mayor cantidad de caracteres.
		 */
		
		//Leer la cantidad de nombre:
		System.out.println("Ingrese la cantidad de nombres: ");
		var cantidad = lt.nextInt();
		
		var nombres = new String[cantidad];
		
		//leer los nombres ingresados
		lt.nextLine();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese el nombre " + (i + 1) + ": ");
			nombres[i] = lt.nextLine();			
		}
		
		var mayorCaracteres = nombres[0];
		int pocision = 0;
		
		//hayar el nombre con mayor caracteres
		for (int i = 1; i < cantidad; i++) {
			if(nombres[i].length() > mayorCaracteres.length()) {
				mayorCaracteres = nombres[i];
				pocision = i;
			}
			
		}
		
		//Imprimir la pocision de el nombre con mayor caracteres
		System.out.println("Pocision: " + pocision);
		
		//Imprimir el nombre com mayor cantidad de caracteres
		System.out.println("El nombre com mayor cantidad de caracteres es: " + mayorCaracteres);
	}

}
