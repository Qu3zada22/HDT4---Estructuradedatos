package org.Angginathan;

/**
 * Interfaz que define una lista enlazada genérica.
 *
 * @param <T> el tipo de elementos que contendrá la lista
 */
public interface UVGLList<T> {
    /*
     * Interfaz de una LList
     * - Utiliza generics.
     * - Cambio el nombre a UVGList para diferenciarlo del LLlist de Java Collections.
     * - Solo las funciones que son necesarias para el proyecto son implementadas.
     */

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst();

    /**
     * Devuelve el primer elemento de la lista.
     *
     * @return el primer elemento de la lista
     */
    public T getFirst();

    /**
     * Agrega un elemento al principio de la lista.
     *
     * @param x el elemento a agregar
     */
    public void addFirst(T x);

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario
     */
    public boolean isEmpty();
}
