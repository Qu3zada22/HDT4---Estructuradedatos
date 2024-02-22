package org.Angginathan;

import java.util.ArrayList;

/**
 * Implementación de una cola utilizando un ArrayList como estructura de datos subyacente.
 *
 * @param <T> el tipo de elementos que contendrá la cola
 */
public class StackArrayList<T> implements UVGQueue<T> {
    ArrayList<T> data = null;

    /**
     * Constructor de la clase StackArrayList.
     * Inicializa el ArrayList utilizado para almacenar los elementos de la cola.
     */
    public StackArrayList() {
        data = new ArrayList<T>();
    }

    /**
     * Devuelve el elemento en el frente de la cola sin eliminarlo.
     *
     * @return el elemento en el frente de la cola, o null si la cola está vacía
     */
    public T front() {
        if (data.size() > 0) {
            return data.get(0);
        }
        return null;
    }

    /**
     * Agrega un elemento al final de la cola.
     *
     * @param x el elemento a encolar
     */
    public void enqueue(T x) {
        data.add(x);
    }

    /**
     * Elimina y devuelve el elemento en el frente de la cola.
     *
     * @return el elemento eliminado de la cola
     */
    public T dequeue() {
        return data.remove(data.size() - 1);
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @return true si la cola está vacía, false en caso contrario
     */
    public boolean isEmpty() {
        return (data.size() == 0);
    }

}
