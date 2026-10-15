import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperatura en °C: ");
        double celsius = scanner.nextDouble();

        // Aplicamos la fórmula: °F = (°C * 9 / 5) + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");

        scanner.close();
    }
}