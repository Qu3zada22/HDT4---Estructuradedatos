package org.Angginathan;

/**
 * Interfaz que define una cola genérica.
 *
 * @param <T> el tipo de elementos que contendrá la cola
 */
public interface UVGQueue<T> {
    /*
     * Interfaz de una Queue
     * - Utiliza generics.
     * - Cambio el nombre a UVGQueue para diferenciarlo de Java Collections.
     */

    /**
     * Devuelve el primer elemento de la cola sin eliminarlo.
     *
     * @return el primer elemento de la cola
     */
    public T front();

    /**
     * Agrega un elemento al final de la cola.
     *
     * @param x el elemento a agregar
     */
    public void enqueue(T x);

    /**
     * Elimina y devuelve el primer elemento de la cola.
     *
     * @return el primer elemento de la cola
     */
    public T dequeue();

    /**
     * Verifica si la cola está vacía.
     *
     * @return true si la cola está vacía, false de lo contrario
     */
    public boolean isEmpty();

}
