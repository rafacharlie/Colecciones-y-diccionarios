'''
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.

@author Rafael Infante
@version: 1.0
'''

'''de la biclioteca random importo la funcion randint'''
'''genera numeros enteros de un minimo a un maximo'''
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

vmax=lista[0]
vmin=lista[0]
'''
extraigo valor maximo, minimo y la suma de todos los elementos de la lista
'''
for i in range(0,len(lista)):
 
  if vmax<lista[i]:
    vmax=lista[i]
  if vmin>lista[i]:
    vmin=lista[i]
  
  suma+=lista[i]

print("El valor minimo es: ", vmin)
print("El valor maximo es: ", vmax)
print("El valor medio es: ", suma/len(lista))
