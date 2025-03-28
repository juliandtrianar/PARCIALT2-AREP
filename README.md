## Parcial T2 AREP

Enunciado
La factorización de números enteros es un problema complejo para el cual no se conocen algoritmos clásicos eficientes. La criptografía clásica está soportada en la dificultad para encontrar los factores primos de números grandes.

Diseñe, construya y despliegue un aplicación web para investigar los factores de números enteros y los números primos. El programa debe estar desplegado en tres máquinas virtuales de EC2 de AWS como se describe abajo. Las tecnologías usadas en la solución deben ser maven, git, github, Spring, html5, y js. No use liberías adicionales.


Sobre las funciones numéricas:
Sus servicios matemáticos deben incluir dos funciones. 
Una para calcular los factores de un número: factors(n) retorna un json con una lista de números enteros positivos. (Recibe solo enteros positivos)
Una para calcular los números primos hasta un número dado: primes(n), retorna en un json los números primos menores o iguales a n.
PARA AMBAS IMPLEMENTACIONES USE UN ALGORITMO  DE FUERZA BRUTA, ES DECIR EXPLORE CADA UNO DE LOS VALORES. Usted debe implementar las dos funciones, no debe usar funciones de una librería o del API (si ya existen).

Por ejemplo, para un  número dado n los factores se pueden calcular así:
1 es un factor de todos los números
de ahí en adelante simplemente mirando el módulo puede verificar si es o no factor.
Puede mirar todos los numeros hasta n/2
n pertenece también a los factores.
Para los primos, puede usar su función de factores así:

1 es un número primo
de ahí en adelante recuerde que un número es primo si solo es divisible por 1 y por si mismo.
Es decir un número es primo si el tamaño del conjunto de factores es 2.
Asegúrese que sus funciones sirven cuando el parámetro es 1.

## Ejecución del proyecto 

- clone el repositorio en su maquina local con 

```
git clone https://github.com/juliandtrianar/PARCIALT2-AREP.git
```

https://amazonxxx.x.xxx.x.xxx:{port}/factors?value=13
{
 "operation": "factors",
 "input":  112,
 "output":  "1, 2, 4, 7, 8, 14, 16, 28, 56, 112"
}
https://amazonxxx.x.xxx.x.xxx:{port}/primes?value=100
{
 "operation": "primes",
 "input":  100,
 "output":  "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97"
}

## Autor

Julián David Triana Roa
