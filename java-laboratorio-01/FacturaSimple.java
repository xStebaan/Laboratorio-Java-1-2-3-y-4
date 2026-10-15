public class FacturaSimple {

    public static void main(String[] args) {
        String producto = "Audífonos";
        double precioUnitario = 100000.0;
        int cantidad = 2;
        double porcentajeDescuento = 0.10;

        double subtotal = precioUnitario * cantidad;
        double descuento = subtotal * porcentajeDescuento;
        double total = subtotal - descuento;

        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total: $" + total);
    }
}
