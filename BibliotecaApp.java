import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    static ArrayList<ArrayList<Object>> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> registrarPrestamo();
                case 2 -> mostrarPrestamos();
                case 3 -> buscarPrestamoPorId();
                case 4 -> actualizarPrestamo();
                case 5 -> eliminarPrestamo();
                case 6 -> calcularTotalMultas();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 7);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("=== Biblioteca: Gestión de Préstamos ===");
        System.out.println("1. Registrar nuevo préstamo");
        System.out.println("2. Mostrar todos los préstamos");
        System.out.println("3. Buscar préstamo por ID");
        System.out.println("4. Actualizar un préstamo");
        System.out.println("5. Eliminar un préstamo");
        System.out.println("6. Calcular total de multas");
        System.out.println("7. Salir");
    }

    // ====== CRUD (por implementar) ======
    static void registrarPrestamo() {
    System.out.println("--- Registrar nuevo préstamo ---");

    int idPrestamo = leerEntero("ID del préstamo: ");
    String nombreUsuario = leerTexto("Nombre del usuario: ");
    String tituloLibro = leerTexto("Título del libro: ");
    int diasPrestamo = leerEntero("Días de préstamo: ");
    System.out.println("2000$ multa por día de retraso");
    int multaPorDia = 2000;

    ArrayList<Object> prestamo = new ArrayList<>();
    prestamo.add(idPrestamo);
    prestamo.add(nombreUsuario);
    prestamo.add(tituloLibro);
    prestamo.add(diasPrestamo);
    prestamo.add(multaPorDia);

    prestamos.add(prestamo);

    System.out.println("Préstamo registrado correctamente.");
}

    static void mostrarPrestamos() { /* TODO */ }
    static void buscarPrestamoPorId() { /* TODO */ }
    static void actualizarPrestamo() { /* TODO */ }
    static void eliminarPrestamo() { /* TODO */ }

    // ====== Cálculo (por implementar) ======
    static void calcularTotalMultas() { 
        int diamulta.get(3);
        int valormulta.get(4);
        int totalmulta = diamulta * valormulta;
        System.out.println("El total de multas es: " + totalmulta);

    }

    // ====== Utilidades mínimas ======
    static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }

    static String leerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }
}