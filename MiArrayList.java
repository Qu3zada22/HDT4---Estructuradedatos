import java.util.Arrays;

public class MiArrayList<E> {
    private static final int CAPACIDAD_INICIAL = 10;
    private Object[] elementos;
    private int tamaño;

    public MiArrayList() {
        elementos = new Object[CAPACIDAD_INICIAL];
        tamaño = 0;
    }

    public void agregar(E elemento) {
        if (tamaño == elementos.length) {
            aumentarCapacidad();
        }
        elementos[tamaño++] = elemento;
    }

    @SuppressWarnings("unchecked")
    public E obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (E) elementos[indice];
    }

    private void aumentarCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        elementos = Arrays.copyOf(elementos, nuevaCapacidad);
    }

    public int tamaño() {
        return tamaño;
    }

    public boolean estaVacio() {
        return tamaño == 0;
    }
}
