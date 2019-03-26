/**Realiza un programa que escoja al azar 10 cartas de la baraja española
(10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
almacenarlas y asegúrate de que no se repite ninguna.

@author Rafael Infante
*/
package coleccionesDiccionarios;

import java.util.ArrayList;

public class Ejercicio8 {

	public static void main(String[] args) {
		ArrayList<Carta> c = new ArrayList<Carta>();

		Carta cartaAux = new Carta();
		c.add(cartaAux);

		for (int i = 0; i < 9; i++) {
			do {
				cartaAux = new Carta();
			} while (c.contains(cartaAux));

			c.add(cartaAux);
		}

		for (Carta miCarta : c) {
			System.out.println(miCarta);
		}

	}// fin main

}// fin clase Ejercicio8
