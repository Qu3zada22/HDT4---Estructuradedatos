package org.Angginathan;

public interface UVGQueue<T> {
    /*
     * Interfaz de una Queue
     * - Utiliza generics.
     * - Cambio el nombre a UVGQueue para diferenciarlo de java collections.
     */
    public T front();

    public void enqueue(T x);

    public T dequeue();

    public boolean isEmpty();

}
