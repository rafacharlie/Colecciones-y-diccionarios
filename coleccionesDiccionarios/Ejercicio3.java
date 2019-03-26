/**Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.

@author Rafael Infante
*/
package coleccionesDiccionarios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; //importamos la clase Collections

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variables
		int n = 10;
		int i;
		int numero;

		// ArrayList lista
		ArrayList<Integer> lista = new ArrayList<>(n);

		System.out.println("Introduzca 10 numeros. ");

		// pedimos 10 numeros por teclado
		for (i = 0; i < n; i++) {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			lista.add(numero);
		}

		// muestra la lista desordenada
		System.out.println("Lista original: " + lista);
		
		Collections.sort(lista); //metodo que ordena un ArrayList
		
		// muestra la lista ordenada de mayor a menor
		System.out.println("Lista ordenada de menor a mayor: " + lista);
	}

}
