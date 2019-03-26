/**Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.

@author Rafael Infante
*/
package coleccionesDiccionarios;

import java.util.Collections; //importamos la clase Collections
import java.util.ArrayList;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		ArrayList<Carta> c = new ArrayList<Carta>();
		ArrayList<Carta> ca = new ArrayList<Carta>();

		Carta cartaAux = new Carta();
		c.add(cartaAux);

		for (int i = 0; i < 9; i++) {
			do {
				cartaAux = new Carta();
			} while (c.contains(cartaAux));

			c.add(cartaAux);
		}
		
		Collections.sort(c);
		
		for (Carta miCarta : c) {
			System.out.println(miCarta);
		}

	}

}
