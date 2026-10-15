import java.util.Scanner;

public class LecturasMixtas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        
        // Esta línea adicional consume el salto de línea pendiente que deja nextInt()
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}
