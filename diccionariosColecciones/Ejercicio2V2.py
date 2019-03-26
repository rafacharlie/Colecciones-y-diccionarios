'''
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.

@author Rafael Infante
@version: 2.0
'''
from random import randint

#Creo una lista vacia
lista=[]

'''PROGRAMA PRINCIPAL'''

suma=0

minimo=int(input("Introduce un valor minimo: "))
maximo=int(input("Introduce un valor maximo: "))

#genero aleatorios
for i in range(minimo,maximo):
  lista.append(randint(0, 100))

print(lista)

'''
funciones utiles para hacerlo mas facil
'''
print ("Maximo: ", (max(lista)))
print ("Maximo: ", (min(lista)))
print ("Media: ", (sum(lista)//len(lista)))
