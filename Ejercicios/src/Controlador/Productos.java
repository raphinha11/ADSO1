package Controlador;

import java.util.Scanner;

public class Productos {

	public static void main(String[] args) {
		Scanner lt = new Scanner(System.in);
		/*Realzar un programa en java que permita leer un arreglo de N productos.
		 *Al final mostrar un arreglo resultante en donde se le calcule el 10% de 
		 *descuento a aquellos precios de productos superiores a 55K y en los demás
		 *casos aplicar un descuento del 5%.
		 */

        // Leer la cantidad de precios
        System.out.print("Ingrese la cantidad de precios de productos: ");
        int n = lt.nextInt();

        // Declarar el arreglo de precios
        double[] precios = new double[n];

        // Leer los precios de los productos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = lt.nextDouble();
        }

        // Aplicar descuentos y mostrar el arreglo resultante
        System.out.println("Precios con descuento:");
        for (int i = 0; i < n; i++) {
            if (precios[i] > 55000) {
                precios[i] *= 0.90; // Aplicar 10% de descuento
            } else {
                precios[i] *= 0.95; // Aplicar 5% de descuento
            }
            System.out.printf("Producto %d: %.2f\n", (i + 1), precios[i]);
        }

        
    }
}