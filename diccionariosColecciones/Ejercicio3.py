'''
Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.

@author Rafael Infante
'''

'''
lista
'''
lista=[]

'''
variables
'''
minimo=0
maximo=10

'''
PROGRAMA PRINCIPAL
'''

'''
genero aleatorios
'''
for i in range(minimo,maximo):
  x=int(input("Introduce un numero: "))
  lista.append(x)

print(lista)
'''
mayor a menor
'''
lista.sort(reverse = True)
print(lista)

'''
menor a mayor'''
print(sorted(lista))