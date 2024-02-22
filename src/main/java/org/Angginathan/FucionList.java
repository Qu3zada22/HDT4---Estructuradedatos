package org.Angginathan;

/**
 * Implementación de una cola utilizando una lista enlazada.
 *
 * @param <T> el tipo de elementos que contendrá la cola
 */
public class FucionList<T> implements UVGQueue<T> {
    UVGLList<T> lista = null;

    /**
     * Constructor de la clase.
     *
     * @param type el tipo de lista que se utilizará ("simple" o "doble")
     */
    public FucionList(String type) {
        ListaFactory<T> tmp = new ListaFactory<>();
        lista = tmp.crearLista(type);
    }

    /**
     * Devuelve el elemento en el frente de la cola.
     *
     * @return el elemento en el frente de la cola
     * @throws IllegalStateException si la cola está vacía
     */
    @Override
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return lista.getFirst();
    }

    /**
     * Agrega un elemento a la cola.
     *
     * @param x el elemento a agregar a la cola
     */
    @Override
    public void enqueue(T x) {
        lista.addFirst(x); // Agregar elementos al principio de la lista enlazada
    }

    /**
     * Elimina y devuelve el elemento del frente de la cola.
     *
     * @return el elemento eliminado del frente de la cola
     * @throws IllegalStateException si la cola está vacía
     */
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new Illeg
