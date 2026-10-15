public class ProductoFicha {

    public static void main(String[] args) {
        final double IVA = 0.19;

        int codigo = 105;
        String nombre = "Mouse inalámbrico";
        char categoria = 'A';
        double precio = 78000.0;
        int cantidad = 12;
        boolean activo = true;

        System.out.println("-------------------------");
        System.out.println(" PRODUCTO ");
        System.out.println("-------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Activo: " + activo);
        System.out.println("Impuesto: " + IVA);
    }
}

