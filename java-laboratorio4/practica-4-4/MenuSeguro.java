import java.util.Scanner;

public class MenuSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Consultar");
            System.out.println("2. Registrar");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            String entrada = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        System.out.println(">> Seleccionaste: Consultar.");
                        break;
                    case 2:
                        System.out.println(">> Seleccionaste: Registrar.");
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Error: La opción no existe.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: La opción no es numérica. Ingresa un número válido.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}