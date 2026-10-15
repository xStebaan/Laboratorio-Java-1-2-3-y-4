import java.util.Scanner;

public class EntradaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();

        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);

        scanner.close();
    }
}
