package umg.edu.progra.listas;

public class Lista {
    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    public Lista() {
        primero = null;
    }

    public Nodo leerPrimero() {
        return primero;
    }

    public void insertarCabezaLista(int entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
    }

    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;
    }

    public void eliminar(int entrada) {
        Nodo actual = primero, anterior = null;
        while (actual != null && actual.dato != entrada) {
            anterior = actual;
            actual = actual.enlace;
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
        }
    }

    public Nodo buscarLista(int destino) {
        Nodo indice = primero;
        while (indice != null) {
            if (indice.dato == destino) {
                return indice;
            }
            indice = indice.enlace;
        }
        return null;
    }

    public void visualizar() {
        Nodo n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
        System.out.println();
    }

    // 1. Método para ordenar la lista de forma ascendente
    public void ordenarAscendente() {
        if (primero == null || primero.enlace == null) {
            return;
        }
        Nodo actual, indice;
        int temp;
        for (actual = primero; actual != null; actual = actual.enlace) {
            for (indice = actual.enlace; indice != null; indice = indice.enlace) {
                if (actual.dato > indice.dato) {
                    temp = actual.dato;
                    actual.dato = indice.dato;
                    indice.dato = temp;
                }
            }
        }
    }

    // 2. Método para unir dos listas enlazadas
    public void unirListas(Lista otraLista) {
        if (primero == null) {
            primero = otraLista.primero;
            return;
        }
        Nodo temp = primero;
        while (temp.enlace != null) {
            temp = temp.enlace;
        }
        temp.enlace = otraLista.primero;
    }

    // 3. Método para separar números pares e impares en dos listas enlazadas diferentes
    public void separarParesImpares(Lista listaPares, Lista listaImpares) {
        Nodo temp = primero;
        while (temp != null) {
            if (temp.dato % 2 == 0) {
                listaPares.insertarCabezaLista(temp.dato);
            } else {
                listaImpares.insertarCabezaLista(temp.dato);
            }
            temp = temp.enlace;
        }
    }
}
