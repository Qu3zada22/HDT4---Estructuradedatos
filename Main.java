import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué estructura de datos desea utilizar?");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea después de la entrada del número
        
        if (opcion == 1 || opcion == 2) {
            System.out.println("¿Qué tipo de pila desea utilizar?");
            System.out.println("1. Simple");
            System.out.println("2. Double");
            
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea después de la entrada del número
            
            if (opcion == 1) {
                if (tipo == 1) {
                    Pila<String> pila = VectorFactory.createStack("simple");
                    // Haz lo que necesites con la pila
                } else if (tipo == 2) {
                    Pila<String> pila = VectorFactory.createStack("double");
                    // Haz lo que necesites con la pila
                } else {
                    System.out.println("Opción no válida");
                }
            } else if (opcion == 2) {
                if (tipo == 1) {
                    Pila<String> pila = VectorFactory.createStack("simple");
                    // Haz lo que necesites con la pila
                } else if (tipo == 2) {
                    Pila<String> pila = VectorFactory.createStack("double");
                    // Haz lo que necesites con la pila
                } else {
                    System.out.println("Opción no válida");
                }
            } else {
                System.out.println("Opción no válida");
            }
        } else if (opcion == 3) {
            System.out.println("¿Qué tipo de lista desea utilizar?");
            System.out.println("1. Simple");
            System.out.println("2. Double");
            
            String tipoLista = scanner.nextLine();
            
            if (tipoLista.equals("simple")) {
                InterfazLista<String> lista = ListaFactory.crearLista("simple");
                // Haz lo que necesites con la lista simple
            } else if (tipoLista.equals("double")) {
                InterfazLista<String> lista = ListaFactory.crearLista("double");
                // Haz lo que necesites con la lista doble
            } else {
                System.out.println("Opción no válida");
            }
        } else {
            System.out.println("Opción no válida");
        }
        
        scanner.close();
    }

    @SuppressWarnings("unused")
    private static String leerExpresionPostfixDesdeArchivo(String nombreArchivo) throws IOException {
        StringBuilder expresionPostfix = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                expresionPostfix.append(linea.trim());
            }
        }
        return expresionPostfix.toString();
    }
}
