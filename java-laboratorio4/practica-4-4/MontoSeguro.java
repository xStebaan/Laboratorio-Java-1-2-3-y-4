import java.util.Scanner;

public class MontoSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monto = 0;
        boolean valido = false;

        do {
            System.out.print("Ingrese un monto positivo y finito: ");
            String entrada = scanner.nextLine();

            try {
                monto = Double.parseDouble(entrada);

                if (!Double.isFinite(monto) || monto <= 0) {
                    System.out.println("Debes escribir un monto positivo y finito.");
                } else {
                    System.out.println("¡Monto aceptado con éxito!: $" + monto);
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: El texto ingresado no representa un número válido.");
            }

        } while (!valido);

        scanner.close();
    }
}