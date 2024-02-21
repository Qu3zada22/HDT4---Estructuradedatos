public class ListaDoble<T> extends AbstractLista<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public void insertarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primero;
            primero.anterior = nuevoNodo;
            primero = nuevoNodo;
        }
        tamaño++;
    }

    public T eliminarPrimero() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista está vacía");
        }
        T dato = primero.dato;
        primero = primero.siguiente;
        if (primero != null) {
            primero.anterior = null;
        } else {
            ultimo = null;
        }
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
        Nodo<T> anterior;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }
}
