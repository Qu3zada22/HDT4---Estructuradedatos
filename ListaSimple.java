public class ListaSimple<T> extends AbstractLista<T> {
    private Nodo<T> primero;

    public void insertarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
        tamaño++;
    }

    public T eliminarPrimero() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }
        T dato = primero.dato;
        primero = primero.siguiente;
        tamaño--;
        return dato;
    }

    public T obtenerPrimero() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }
        return primero.dato;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
}
