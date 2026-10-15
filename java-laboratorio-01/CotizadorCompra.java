import java.util.Scanner;

public class CotizadorCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("       COTIZADOR JAVA        ");
        System.out.println("=============================");

        // Datos básicos de la cotización y personas
        System.out.print("Código de la cotización: ");
        String codigoCotizacion = scanner.nextLine();

        System.out.print("Nombre del vendedor: ");
        String vendedor = scanner.nextLine();

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Descuento (%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        System.out.print("Impuesto (%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        System.out.print("Costo de envío: ");
        double costoEnvio = scanner.nextDouble();

        // Procesamiento por etapas
        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * (descuentoPorcentaje / 100.0);
        double base = subtotal - valorDescuento;
        double valorImpuesto = base * (impuestoPorcentaje / 100.0);
        
        // El total intermedio antes de envío
        double totalSinEnvio = base + valorImpuesto;
        
        // El costo de envío se suma al final después del impuesto
        double totalFinal = totalSinEnvio + costoEnvio;

        // Salida formateada con todos los datos nuevos
        System.out.println("\n-----------------------------");
        System.out.println("     RESUMEN DE COTIZACIÓN   ");
        System.out.println("-----------------------------");
        System.out.println("Código de cotización: " + codigoCotizacion);
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + valorImpuesto);
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("TOTAL FINAL: $" + totalFinal);

        scanner.close();
    }
}