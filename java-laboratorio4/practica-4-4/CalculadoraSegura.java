import java.util.Scanner;

public class CalculadoraSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n=== CALCULADORA SEGURA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            String entradaOpcion = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entradaOpcion);

                if (opcion == 0) {
                    System.out.println("Saliendo de la calculadora...");
                    break;
                }

                if (opcion < 1 || opcion > 4) {
                    System.out.println("La opción no existe en el menú. Intenta de nuevo.");
                    continue;
                }

                // Solicitar los dos números de forma segura
                double num1 = leerNumero(scanner, "Ingresa el primer número: ");
                double num2 = leerNumero(scanner, "Ingresa el segundo número: ");

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Operación no permitida: No se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado: " + (num1 / num2));
                        }
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada incorrecta: debes escribir un número entero para la opción del menú.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    // Método auxiliar reutilizable para leer números de manera segura
    private static double leerNumero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                double valor = Double.parseDouble(entrada);
                if (!Double.isFinite(valor)) {
                    System.out.println("Valor inválido (NaN o Infinity). Intenta de nuevo.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: debes escribir un número válido.");
            }
        }
    }
}