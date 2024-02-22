package org.Angginathan;

/**
 * Implementación de una lista enlazada simple.
 *
 * @param <T> el tipo de elementos que contendrá la lista
 */
public class ListaSimple<T> implements UVGLList<T> {
    /**
     * Clase interna que representa un nodo de la lista enlazada simple.
     * Cada nodo contiene un elemento de datos y una referencia al siguiente nodo en la lista.
     */
    private class Node<T> {
        /** El elemento de datos almacenado en el nodo */
        public T data;
        /** La referencia al siguiente nodo en la lista */
        public Node<T> next = null;

        /**
         * Constructor para crear un nuevo nodo con el dato especificado.
         *
         * @param cData el dato a almacenar en el nodo
         */
        public Node(T cData) {
            data = cData;
        }
    }

    /** La referencia al primer nodo de la lista */
    private Node<T> head = null;

    /**
     * Método para verificar si la lista está vacía.
     *
     * @return true si la lista está vacía, false de lo contrario
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Método para obtener el primer elemento de la lista.
     *
     * @return el primer elemento de la lista, o null si la lista está vacía
     */
    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * Método para eliminar el primer elemento de la lista.
     * Si la lista no está vacía, el primer nodo se elimina y la cabeza se actualiza para apuntar al siguiente nodo.
     */
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    /**
     * Método para agregar un nuevo elemento al principio de la lista.
     * Si la lista está vacía, se crea un nuevo nodo y se establece como la cabeza de la lista.
     * Si la lista no está vacía, el nuevo nodo se enlaza al nodo actual de la cabeza y luego se convierte en la nueva cabeza.
     *
     * @param x el elemento a agregar a la lista
     */
    public void addFirst(T x) {
        Node<T> newNode = new Node<T>(x);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
