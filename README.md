# Proyecto: Listas Enlazadas en Java

## Descripción
Este proyecto implementa una estructura de datos de **Lista Enlazada Simple** en Java, permitiendo realizar diversas operaciones como inserción, eliminación, ordenamiento y manipulación de los elementos en la lista.

## Autores
Este código fue desarrollado por **MMarcos00** junto con su compañero de aula **Fabián**, quien colaboró en la implementación pero no contaba con una computadora en ese momento.

## Características Principales
- **Inserción de elementos**: Se pueden agregar elementos a la lista mediante la inserción en la cabeza.
- **Eliminación de elementos**: Se permite eliminar un nodo específico por su valor.
- **Búsqueda de elementos**: Se puede buscar un elemento específico en la lista.
- **Visualización de la lista**: Permite imprimir los elementos de la lista en consola.
- **Ordenamiento ascendente**: Se implementa un método para ordenar la lista en orden ascendente.
- **Unión de listas**: Se pueden combinar dos listas enlazadas en una sola.
- **Separación en pares e impares**: Se dividen los elementos en dos listas según si son pares o impares.

## Estructura del Proyecto
El proyecto está compuesto por las siguientes clases:

### 1. `Principal`
Es la clase principal del programa donde se crean instancias de la lista y se realizan las operaciones. Contiene un conjunto de pruebas que ilustran el uso de las funciones implementadas en la clase `Lista`.

### 2. `Lista`
Define la estructura y las operaciones sobre la lista enlazada. Contiene los siguientes métodos:
- `insertarCabezaLista(int entrada)`: Agrega un nuevo nodo al inicio de la lista.
- `insertarLista(Nodo anterior, int entrada)`: Inserta un nodo después de un nodo específico.
- `eliminar(int entrada)`: Elimina un nodo con el valor especificado.
- `buscarLista(int destino)`: Busca un nodo con un valor determinado.
- `visualizar()`: Imprime los elementos de la lista.
- `ordenarAscendente()`: Ordena los elementos de la lista de manera ascendente.
- `unirListas(Lista otraLista)`: Une la lista actual con otra lista enlazada.
- `separarParesImpares(Lista listaPares, Lista listaImpares)`: Separa los elementos pares e impares en dos listas diferentes.

### 3. `Nodo`
Representa un nodo individual de la lista enlazada con dos atributos:
- `dato`: Almacena el valor del nodo.
- `enlace`: Puntero al siguiente nodo en la lista.

## Instalación y Ejecución
Para ejecutar el programa, sigue estos pasos:

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/MMarcos00/Listas.git
   ```
2. **Abrir el proyecto en un IDE compatible con Java**, como IntelliJ IDEA o Eclipse.
3. **Ejecutar la clase `Principal`** como aplicación Java.

## Uso del Programa
Al ejecutar el programa, se realizarán las siguientes operaciones:
1. Insertar los elementos `{6, 5, 4, 3, 2, 1}` en la lista original.
2. Mostrar la lista original.
3. Ordenar la lista en orden ascendente y mostrarla.
4. Unir la lista con otra lista `{8, 7}` y mostrar el resultado.
5. Separar la lista en dos listas: una con los elementos pares y otra con los impares.
6. Mostrar la lista de pares e impares resultantes.

## Contribución
Si deseas contribuir a este proyecto:
1. Haz un fork del repositorio.
2. Crea una nueva rama:
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. Realiza los cambios y sube tu código:
   ```bash
   git commit -m "Agregada nueva funcionalidad"
   git push origin nueva-funcionalidad
   ```
4. Abre un Pull Request en GitHub.

## Licencia
Este proyecto está bajo la licencia MIT.

## Contacto
Para consultas o sugerencias, puedes contactar a [MMarcos00](https://github.com/MMarcos00).

