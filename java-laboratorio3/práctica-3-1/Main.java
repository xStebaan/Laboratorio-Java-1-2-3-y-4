class Producto {
    String nombre;
    double precio;
    int cantidad;

    void mostrarDetalle() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    double calcularSubtotal() {
        return precio * cantidad;
    }
}

public class Main {
    public static void main(String[] args) {
        // Primer producto
        Producto prod1 = new Producto();
        prod1.nombre = "Teclado Mecánico";
        prod1.precio = 120000;
        prod1.cantidad = 2;

        // Segundo producto
        Producto prod2 = new Producto();
        prod2.nombre = "Mouse Inalámbrico";
        prod2.precio = 45000;
        prod2.cantidad = 3;

        // Tercer producto
        Producto prod3 = new Producto();
        prod3.nombre = "Monitor 24 pulgadas";
        prod3.precio = 650000;
        prod3.cantidad = 1;

        // Mostrar detalles y subtotales
        prod1.mostrarDetalle();
        double sub1 = prod1.calcularSubtotal();
        System.out.println("Subtotal: $" + sub1);
        System.out.println("-----------------------------");

        prod2.mostrarDetalle();
        double sub2 = prod2.calcularSubtotal();
        System.out.println("Subtotal: $" + sub2);
        System.out.println("-----------------------------");

        prod3.mostrarDetalle();
        double sub3 = prod3.calcularSubtotal();
        System.out.println("Subtotal: $" + sub3);
        System.out.println("-----------------------------");

        // Calcular el valor total
        double totalGeneral = sub1 + sub2 + sub3;
        System.out.println("VALOR TOTAL DEL CATÁLOGO: $" + totalGeneral);
    }
}