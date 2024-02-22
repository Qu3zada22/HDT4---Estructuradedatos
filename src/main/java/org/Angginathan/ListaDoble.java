package org.Angginathan;

public class ListaDoble<T> implements UVGLList<T> {
    private class Node<T> {
        /*
         * Single Linked List Node
         */
        public T data;
        public Node<T> next = null;
        public Node<T> prev = null;

        public Node(T cData) {
            data = cData;
        }
    }

    public Node<T> head = null;
    public Node<T> tail = null;

    public void removeFirst() {
        if (head != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        }
    }

    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public void addFirst(T x) {
        Node<T> newNode = new Node<T>(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    public boolean isEmpty() {
        return (head == null);
    }

}
