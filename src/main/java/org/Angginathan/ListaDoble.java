package org.Angginathan;

/**
 * Implementación de una lista doblemente enlazada.
 *
 * @param <T> el tipo de elementos que contendrá la lista
 */
public class ListaDoble<T> implements UVGLList<T> {
    /**
     * Clase interna que representa un nodo de la lista.
     */
    private class Node<T> {
        public T data; // Almacena el dato del nodo
        public Node<T> next = null; // Referencia al siguiente nodo
        public Node<T> prev = null; // Referencia al nodo anterior

        /**
         * Constructor de la clase Node.
         *
         * @param cData el dato que se almacenará en el nodo
         */
        public Node(T cData) {
            data = cData;
        }
    }

    public Node<T> head = null; // Referencia al primer nodo de la lista
    public Node<T> tail = null; // Referencia al último nodo de la lista

    /**
     * Elimina el primer nodo de la lista.
     */
    public void removeFirst() {
        if (head != null) {
            if (head == tail) {
                // Si solo hay un nodo en la lista, se eliminan las referencias a éste
                head = null;
                tail = null;
            } else {
                // Si hay más de un nodo, se actualiza la referencia al primer nodo
                head = head.next;
            }
        }
    }

    /**
     * Obtiene el dato almacenado en el primer nodo de la lista.
     *
     * @return el dato del primer nodo, o null si la lista está vacía
     */
    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * Agrega un nuevo nodo al principio de la lista.
     *
     * @param x el dato que se almacenará en el nuevo nodo
     */
    public void addFirst(T x) {
        Node<T> newNode = new Node<T>(x);
        if (head == null) {
            // Si la lista está vacía, el nuevo nodo se convierte en el primer y único nodo
            head = newNode;
            tail = newNode;
        } else {
            // Si la lista no está vacía, el nuevo nodo se agrega al principio y se actualiza la referencia al primer nodo
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * Verifica si la lista está vacía.
     *
     * @return true si la lista está vacía, false en caso contrario
     */
    public boolean isEmpty() {
        return (head == null);
    }
}
