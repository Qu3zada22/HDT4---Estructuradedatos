package org.Angginathan;

public interface UVGLList<T> {
    /*
     * Interfaz de una LList
     * - Utiliza generics.
     * - Cambio el nombre a UVGList para diferenciarlo del LLlist de java
     * collections.
     * - Solo las funciones que son necesarias para el proyecto son implementadas.
     */
    public void removeFirst();

    public T getFirst();

    public void addLast(T x);

    public boolean isEmpty();

    public String toString();
}