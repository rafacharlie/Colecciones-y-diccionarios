/**Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.

@author Rafael Infante
*/
package coleccionesDiccionarios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random; //importo la clase random

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random(); // objeto clase random

		// variables
		int n = 0; // numero elementos del arraylist
		int opcion;
		int sumatorio = 0;
		int i;

		ArrayList<Integer> numAleatorios = new ArrayList<>(n);

		// PROGRAMA PRINCIPAL

		// permite cribar para que el tamaño del array sea entre 10 y 20 elementos
		do {
			System.out.println("Introduzca el numero de elementos aleatorios para rellenar nuestro ArrayList:");
			n = sc.nextInt();
			if (n < 10 || n > 20) {
				System.out.println(
						"No se permite almacenar ese numero de elementos. Recuerde que tiene que ser entre 10 y 20 ambos inclusive.");
			} else {
				break;
			}
		} while (n < 10 || n > 20);

		// rellenamos el array con numeros aleatorios del 0 al 100
		for (i = 0; i < n; i++) {
			numAleatorios.add(random.nextInt(101));
		}

		int maximo = numAleatorios.get(0);
		int minimo = numAleatorios.get(0);

		System.out.println("Los numeros aleatorios son: ");

		// Imprimimos numeros aleatorios y de pasada pillamos los valores maximos y minimos
		for (i = 0; i < n; i++) {
			System.out.print(numAleatorios.get(i) + "  ");
			if (maximo < numAleatorios.get(i)) {
				maximo = numAleatorios.get(i);
			}
			if (minimo > numAleatorios.get(i)) {
				minimo = numAleatorios.get(i);
			}
		}

		System.out.println("\n");// salto de linea

		// mostramos el menu
		do {
			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: // suma
				for (i = 0; i < n; i++) {
					sumatorio += numAleatorios.get(i);
				}
				System.out.println("El sumatorio de los elementos del ArraList es: " + sumatorio);
				break;

			case 2: //media
				for (i = 0; i < n; i++) {
					sumatorio += numAleatorios.get(i);
				}
				double media;
				media = (double) sumatorio / numAleatorios.size();
				System.out.println("La media es de: " + media);
				break;

			case 3: // valor maximo
				System.out.println("El valor maximo de los elementos del ArraList es: " + maximo);
				break;

			case 4: // valor minimo
				System.out.println("El valor minimo de los elementos del ArraList es: " + minimo);
				break;
				
			case 5: //salir
				System.out.println("Fin");
			
			}// fin switch
		} while (opcion!=5);
	}// fin main

	/**
	 * metodo que muestra un menu
	 */
	public static void menu() {
		System.out.println("Menu");
		System.out.println("Que desea hacer: ");
		System.out.println("1. Calcula la suma de los elementos.");
		System.out.println("2. Calcula la media.");
		System.out.println("3. Calcula el valor maximo de los elementos");
		System.out.println("4. Calcula el valor minimo de los elementos");
		System.out.println("5. Salir.");
		System.out.println("elija una opcion: ");
	}
}// fin clase
