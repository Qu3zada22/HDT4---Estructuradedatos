import java.util.ArrayList;

public class StackArrayList<T> implements Pila<T> {
    private ArrayList<T> elementos;

    public StackArrayList() {
        elementos = new ArrayList<>();
    }

    public void push(T item) {
        elementos.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
}
