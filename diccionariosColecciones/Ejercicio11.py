'''
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
del ejercicio anterior. El programa irá pidiendo que el usuario
teclee la traducción al inglés de cada una de las palabras y comprobará si
son correctas. Al final, el programa deberá mostrar cuántas respuestas son
válidas y cuántas erróneas.

@author Rafael Infante
'''

from random import randint

'''
variables
'''
cont1 = 0  # contador aciertos
cont2 = 0  # contador fallos

'''
creamos un diccionario vacio
'''
diccionario = {}

'''
creo una lista "es una copia del diccionario, guardo solo claves"
'''
lista = []

'''
creo una lista donde guardo 5 claves
'''
lista5 = []

'''
insertamos claves y valores al diccionario
'''
diccionario['agua'] = 'water'
diccionario['gato'] = 'cat'
diccionario['raton'] = 'mouse'
diccionario['aire'] = 'air'
diccionario['arbol'] = 'tree'
diccionario['puerta'] = 'door'
diccionario['chica'] = 'girl'
diccionario['ojo'] = 'eye'
diccionario['zorro'] = 'fox'
diccionario['tigre'] = 'tiger'
diccionario['lobo'] = 'wolf'
diccionario['tiburon'] = 'shark'
diccionario['maiz'] = 'corn'
diccionario['oso'] = 'bear'
diccionario['perro'] = 'dog'
diccionario['serpiente'] = 'snake'
diccionario['cerdo'] = 'pig'
diccionario['opcion'] = 'option'
diccionario['palabra'] = 'word'
diccionario['coche'] = 'car'

print(diccionario)

'''
paso todas las claves del diccioanrio a una lista
'''
for x, y in diccionario.items():
    lista += [x]
# print(lista)

'''
añadimos la primera palabra
'''
aux = lista[randint(0, 19)]
lista5.append(aux)
# print(lista5)

'''
comparamos palabras para que no se repitan
'''
for i in range(0, 4):
    while lista5.__contains__(aux):
        aux = lista[randint(0, 19)]
    lista5.append(aux)
  
print(lista5)

'''
titulo del programa
'''
print("\tAver si aciertas!")
print("\t=================")
print()

for i in range(0, 5):
    palabraEs = lista5[i]
    print("Introduzca la traduccion de ", palabraEs, ": ")
    palabraIn = input()
    if palabraIn.__eq__(diccionario.get(palabraEs)):
        cont1 = cont1 + 1
    else:
        cont2 = cont2 + 1

print("Tu numero de aciertos es de: ", cont1 , " \nTu numero de fallos es de: ", cont2)

