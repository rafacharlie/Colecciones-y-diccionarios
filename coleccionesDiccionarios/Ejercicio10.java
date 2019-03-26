/**Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.

@author Rafael Infante
*/
package coleccionesDiccionarios;

import java.util.HashMap; //importamos la clase hashmap
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		//variables
		String palabra;
		
		//creacion del mapa
		HashMap<String,String>diccionario=new HashMap<String,String>();
		
		//palabras con su traduccion
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
		
		//System.out.println(diccionario);
		
		//Introducimos una palabra por teclado
		System.out.println("Introduzca una palabra en español: ");
		palabra=sc.nextLine();
		
		//comprobamos si esa palabra esta dentro del diccionario
		if(diccionario.containsKey(palabra)) {
			System.out.println("La palabra traducida al Ingles es: " + diccionario.get(palabra));
		}else {
			System.out.println("Esa palabra no existe en el diccionario.");
		}
		
	}

}
