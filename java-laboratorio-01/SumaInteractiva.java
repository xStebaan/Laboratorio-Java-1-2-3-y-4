import java.util.Scanner;

public class SumaInteractiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.println("\n=== RESULTADOS DE LAS OPERACIONES ===");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        
        // Hacemos un casting a (double) en el segundo número para evitar división entera truncada
        System.out.println("División: " + (num1 / (double) num2));
        
        System.out.println("Residuo (Módulo): " + (num1 % num2));

        scanner.close();
    }
}
