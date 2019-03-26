/**12. Escribe un programa que genere una secuencia de 5 cartas de la
 *     baraja española y que sume los puntos según el juego de la
 *     brisca. El valor de las cartas se debe guardar en una estructura
 *     <code>HashMap</code> que debe contener parejas (figura, valor),
 *     por ejemplo ("caballo", 3).

 *     La secuencia de cartas debe ser una estructura de la clase <code>
 *     ArrayList</code> que contiene objetos de la clase <code>Carta
 *     </code>. El valor de las cartas es el siguiente: as → 11, tres →
 *     10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale
 *     nada.
 *
 *     Ejemplo:
 *     as de oros
 *     cinco de bastos
 *     caballo de espadas
 *     sota de copas
 *     tres de oros
 *     Tienes 26 puntos
 *    
 *    @author: Rafael Infante
 */
package coleccionesDiccionarios;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {

	public static void main(String[] args) {
		/* arraylist */
		ArrayList<Carta> c = new ArrayList<Carta>();

		/* mapa */
		HashMap<String, Integer> h = new HashMap<String, Integer>();

		/* variables */
		int puntos = 0;

		/* añado los datos del mapa */
		h.put("as", 11);
		h.put("dos", 0);
		h.put("tres", 10);
		h.put("cuatro", 0);
		h.put("cinco", 0);
		h.put("seis", 0);
		h.put("siete", 0);
		h.put("sota", 2);
		h.put("caballo", 3);
		h.put("rey", 4);

		/* añadimos al arraylist una carta */
		Carta cartaAux = new Carta();
		c.add(cartaAux);

		for (int i = 0; i < 4; i++) {
			do {
				cartaAux = new Carta();
			} while (c.contains(cartaAux));

			c.add(cartaAux);
		}
		/*sumamos los puntos*/
		for (Carta miCarta: c) {
      System.out.println(miCarta);
      puntos += h.get(miCarta.getNumero());
		}
		System.out.println();
		System.out.println("Tienes " + puntos + " puntos.");
	}

}
