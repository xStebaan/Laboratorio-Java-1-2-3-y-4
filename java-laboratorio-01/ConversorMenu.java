import java.util.Scanner;

public class ConversorMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR");
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese los kilómetros: ");
                double km = scanner.nextDouble();
                double metros = km * 1000;
                System.out.println(km + " km equivalen a " + metros + " metros.");
            }
            case 2 -> {
                System.out.print("Ingrese los metros: ");
                double mts = scanner.nextDouble();
                double cms = mts * 100;
                System.out.println(mts + " m equivalen a " + cms + " centímetros.");
            }
            case 3 -> {
                System.out.print("Ingrese los grados Celsius: ");
                double c = scanner.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println(c + " °C equivalen a " + f + " °F.");
            }
            case 0 -> System.out.println("Saliendo del conversor...");
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
