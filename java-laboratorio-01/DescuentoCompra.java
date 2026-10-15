import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        double porcentajeAplicado = 0;

        // Evaluar rangos de mayor a menor restricción
        if (valorCompra >= 500000) {
            porcentajeAplicado = 15;
        } else if (valorCompra >= 250000) {
            porcentajeAplicado = 10;
        } else if (valorCompra >= 100000) {
            porcentajeAplicado = 5;
        } else {
            porcentajeAplicado = 0;
        }

        // Cálculos finales
        double valorDescuento = valorCompra * (porcentajeAplicado / 100.0);
        double totalFinal = valorCompra - valorDescuento;

        // Mostrar resultados
        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Valor original: $" + valorCompra);
        System.out.println("Porcentaje aplicado: " + porcentajeAplicado + "%");
        System.out.println("Valor del descuento: $" + valorDescuento);
        System.out.println("Total final a pagar: $" + totalFinal);

        scanner.close();
    }
}
