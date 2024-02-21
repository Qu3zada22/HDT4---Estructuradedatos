public class ListaFactory {
    public static <T> InterfazLista<T> crearLista(String tipo) {
        switch (tipo) {
            case "simple":
                return new ListaSimple<>();
            case "doble":
                return new ListaDoble<>();
            // Agrega otros tipos de lista si es necesario
            default:
                throw new IllegalArgumentException("Tipo de lista no válido");
        }
    }
}
