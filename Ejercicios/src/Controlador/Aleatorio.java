package Controlador;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

	public static void main(String[] args) {
		int tamaño = 5;
		int[] vector1 = new int[tamaño];
		int[] vector2 = new int[tamaño];
		int par1 = 0;
		int par2 = 0;
		int impar1 = 0;
		int impar2 = 0;

		for (int i = 0; i < tamaño; i++) {
			vector1[i] = (int) (Math.random() * 500) + 1;
			vector2[i] = (int) (Math.random() * 500) + 1;

			if (vector1[i] % 2 == 0)
				par1++;
			else
				impar1++;

			if (vector2[i] % 2 == 0)
				par2++;
			else
				impar2++;
		}
		System.out.println("Vector 1: " + Arrays.toString(vector1));
		System.out.println("numeros pares: " + par1);
		System.out.println("Vector 2: " + Arrays.toString(vector2));
		System.out.println("numeros pares: " + par2);

		if (impar1 > impar2) {
			System.out.println("el Vector 1 tiene mas numeros impares ");
		} else if (impar2 > impar1) {
			System.out.println("el Vector 2 tiene mas numeros impares ");
		} else {
			System.out.println("Ambos vectores tienen la misma cantidad de numeros impares ");
		}

		for (int i = 0; i < tamaño - 1; i++) {
			for (int j = 0; j < tamaño - 1 - i; j++) {
				if (vector1[j] > vector1[j + 1]) {
					int temp = vector1[j];
					vector1[j + 1] = temp;
				}
				if (vector2[j] > vector2[j + 1]) {
					int temp = vector2[j];
					vector2[j] = vector2[j + 1];
					vector2[j + 1] = temp;
				}
			}
		}
		System.out.println("Vector 1 ordenado: " + Arrays.toString(vector1));
		System.out.println("Vector 2 ordenado: " + Arrays.toString(vector2));
	}

}
