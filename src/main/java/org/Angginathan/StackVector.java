package org.Angginathan;

import java.util.Vector;

/**
 * Implementación de una estructura de datos de cola utilizando un Vector.
 *
 * @param <T> el tipo de elementos que contendrá la cola
 */
public class StackVector<T> implements UVGQueue<T> {
    Vector<T> data = null;

    /**
     * Constructor de la clase StackVector que inicializa el Vector.
     */
    public StackVector() {
        data = new Vector<T>();
    }

    /**
     * Método para agregar un elemento a la cola.
     *
     * @param x el elemento a agregar
     */
    public void enqueue(T x) {
        data.add(x);
    }

    /**
     * Método para eliminar y devolver el elemento del frente de la cola.
     *
     * @return el elemento del frente de la cola, o null si la cola está vacía
     */
    public T dequeue() {
        int N = data.size();
        if (N > 0) {
            T val = data.get(0);
            data.remove(0);
            return val;
        }
        return null;
    }

    /**
     * Método que verifica si la cola está vacía.
     *
     * @return true si la cola está vacía, false de lo contrario
     */
    public boolean isEmpty() {
        return (data.size() <= 0);
    }

    /**
     * Método que devuelve el elemento del frente de la cola sin eliminarlo.
     *
     * @return el elemento del frente de la cola, o null si la cola está vacía
     */
    public T front() {
        if (data.size() > 0) {
            return data.elementAt(0);
        } else {
            return null;
        }
    }
}
