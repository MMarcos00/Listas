package umg.edu.progra.listas;
//Fabian OSITO --- MARCOS MK
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
    }
}
