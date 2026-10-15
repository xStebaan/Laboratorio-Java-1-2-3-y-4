import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitud de datos al usuario
        System.out.print("Nombre del trabajador: ");
        String trabajador = scanner.nextLine();

        System.out.print("Horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        // Constante para el aporte
        final double APORTE = 0.04;

        // Cálculos
        double pagoBruto = horasTrabajadas * valorPorHora;
        double valorAporte = pagoBruto * APORTE;
        double pagoTotal = pagoBruto - valorAporte;

        // Mostrar el resumen en consola exactamente como lo pide la guía
        System.out.println("\n-------------------------");
        System.out.println("     RESUMEN DE PAGO     ");
        System.out.println("-------------------------");
        System.out.println("Trabajador: " + trabajador);
        System.out.println("Horas: " + horasTrabajadas);
        System.out.println("Valor por hora: $" + valorPorHora);
        System.out.println("Pago total: $" + pagoTotal);

        scanner.close();
    }
}