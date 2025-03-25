package umg.edu.progra.listas;

import umg.edu.progra.listas.doblementeEnlazada.DoblementeEnlazada;

// Fabian OSITO --- MARCOS MK
public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        System.out.println("Lista original:");
        lista.visualizar();

        // Ejercicio 1: Ordenar la lista
        lista.ordenarAscendente();
        System.out.println("\nLista ordenada:");
        lista.visualizar();

        // Ejercicio 2: Unir dos listas
        Lista otraLista = new Lista();
        otraLista.insertarCabezaLista(7);
        otraLista.insertarCabezaLista(8);
        lista.unirListas(otraLista);
        System.out.println("\nLista unida:");
        lista.visualizar();

        // Ejercicio 3: Separar en pares e impares
        Lista listaPares = new Lista();
        Lista listaImpares = new Lista();
        lista.separarParesImpares(listaPares, listaImpares);

        System.out.println("\nLista de pares:");
        listaPares.visualizar();

        System.out.println("\nLista de impares:");
        listaImpares.visualizar();

        // Implementación de la lista doblemente enlazada
        DoblementeEnlazada listaDoble = new DoblementeEnlazada();
        listaDoble.insertAtBeginning(1);
        listaDoble.insertAtBeginning(2);
        listaDoble.insertAtBeginning(3);
        listaDoble.insertAtBeginning(4);
        listaDoble.insertAtBeginning(5);
        listaDoble.insertAtBeginning(6);

        System.out.println("\nLista doblemente enlazada original:");
        listaDoble.displayForward();

        // Método 1: Contar el número de nodos en la lista
        System.out.println("\nNúmero de nodos en la lista doblemente enlazada: " + listaDoble.countNodes());

        // Método 2: Insertar un nodo después de un valor específico
        int valorReferencia = 3;
        int nuevoValor = 99;
        if (listaDoble.insertAfter(valorReferencia, nuevoValor)) {
            System.out.println("\nLista doblemente enlazada después de insertar " + nuevoValor + " después de " + valorReferencia + ":");
            listaDoble.displayForward();
        } else {
            System.out.println("\nNo se encontró el valor " + valorReferencia + " en la lista doblemente enlazada.");
        }

        // Método 3: Revertir la lista doblemente enlazada
        listaDoble.reverse();
        System.out.println("\nLista doblemente enlazada revertida:");
        listaDoble.displayForward();
    }
}
