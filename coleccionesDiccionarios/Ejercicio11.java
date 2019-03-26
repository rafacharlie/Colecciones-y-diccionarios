/**Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
del ejercicio anterior. El programa irá pidiendo que el usuario
teclee la traducción al inglés de cada una de las palabras y comprobará si
son correctas. Al final, el programa deberá mostrar cuántas respuestas son
válidas y cuántas erróneas.

@author Rafael Infante
*/
package coleccionesDiccionarios;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// variables
		int i;
		String aux = "";
		String palabraEs = "";
		String palabraIn = "";
		int cont1 = 0; // contador aciertos
		int cont2 = 0; // contador fallos

		// creacion del mapa
		HashMap<String, String> diccionario = new HashMap<String, String>();

		// creo un arraylist "copia del mapa"
		ArrayList<String> diccionarioArray = new ArrayList<String>();

		// creo otro Arraylist donde almacenar 5 palabras
		ArrayList<String> diccionarioCinco = new ArrayList<String>();

		// palabras con su traduccion
		diccionario.put("gato", "cat");
		diccionario.put("raton", "mouse");
		diccionario.put("agua", "water");
		diccionario.put("perro", "dog");
		diccionario.put("arbol", "tree");
		diccionario.put("edad", "age");
		diccionario.put("aire", "air");
		diccionario.put("arte", "art");
		diccionario.put("centimo", "cent");
		diccionario.put("ciudad", "city");
		diccionario.put("maiz", "corn");
		diccionario.put("dia", "day");
		diccionario.put("puerta", "door");
		diccionario.put("ojo", "eye");
		diccionario.put("chica", "girl");

		// En este arraylist almacenare todas las claves del mapa
		diccionarioArray.addAll(diccionario.keySet());

		// añadimos la primera palabra
		aux = diccionarioArray.get((int) (Math.random() * 15));
		diccionarioCinco.add(aux);

		// Aqui comparamos para que no se nos repita
		for (i = 0; i < 4; i++) {

			do {
				aux = diccionarioArray.get((int) (Math.random() * 15));
			} while (diccionarioCinco.contains(aux));
			diccionarioCinco.add(aux);
		}

		// titulo del programa
		System.out.println("\tAver si aciertas!");
		System.out.println("\t=================");
		System.out.println();

		for (i = 0; i < 5; i++) {
			palabraEs = diccionarioCinco.get(i);
			System.out.println("Introduzca la traduccion de " + palabraEs + ": ");
			palabraIn = sc.nextLine();
			if (palabraIn.equals(diccionario.get(palabraEs))) {
				cont1++;
			} else {
				cont2++;
			}
		}

		System.out.println("Tu numero de aciertos es de: " + cont1 + " \nTu numero de fallos es de: " + cont2);

	}

}
