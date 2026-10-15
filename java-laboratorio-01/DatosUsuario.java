import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de cadenas de texto
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        // Lectura de números enteros
        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        // Limpiamos el salto de línea pendiente antes de la siguiente lectura numérica si fuera necesario, 
        // o en este caso como ya no hay más texturas debajo, lo dejamos limpio.
        System.out.print("Cursos terminados: ");
        int cursos = scanner.nextInt();

        // Mostrar la ficha completa
        System.out.println("\n-------------------------");
        System.out.println(" FICHA DE USUARIO ");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad: " + edad);
        System.out.println("Cursos terminados: " + cursos);

        scanner.close();
    }
}