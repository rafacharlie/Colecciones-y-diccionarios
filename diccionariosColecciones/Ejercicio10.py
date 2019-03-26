'''
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.

@author: Rafael Infante
'''
'''
creamos un diccionario vacio
'''
diccionario={}
'''
insertamos valores
'''
diccionario['agua']='water'
diccionario['gato']='cat'
diccionario['raton']='mouse'
diccionario['aire']='air'
diccionario['arbol']='tree'
diccionario['puerta']='door'
diccionario['chica']='girl'
diccionario['ojo']='eye'
diccionario['zorro']='fox'
diccionario['tigre']='tiger'
diccionario['lobo']='wolf'
diccionario['tiburon']='shark'
diccionario['maiz']='corn'
diccionario['oso']='bear'
diccionario['perro']='dog'
diccionario['serpiente']='snake'
diccionario['cerdo']='pig'
diccionario['opcion']='option'
diccionario['palabra']='word'
diccionario['coche']='car'

print(diccionario)

'''
PROGRAMA PRINCIPAL
'''

x=input("Introduce una palabra en Español: ")

if diccionario.__contains__(x):
  print("La palabra traducida al Ingles es: ", diccionario.get(x))
else:
  print("Esa palabra no existe en el diccionario.")
