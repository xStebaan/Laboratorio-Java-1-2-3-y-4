public class CompararCantidades {

    public static void main(String[] args) {
        // Declaración de variables iniciales
        int inventario = 12;
        int cantidadSolicitada = 8;

        // 1. Guardar si hay inventario suficiente (si inventario es mayor o igual a lo solicitado)
        boolean hayInventarioSuficiente = inventario >= cantidadSolicitada;

        // 2. Guardar si la cantidad solicitada es exactamente igual al inventario
        boolean esIgualInventario = (cantidadSolicitada == inventario);

        // 3. Guardar si la cantidad solicitada supera el inventario
        boolean superaInventario = cantidadSolicitada > inventario;

        // Mostrar los resultados en consola
        System.out.println("Inventario disponible: " + inventario);
        System.out.println("Cantidad solicitada: " + cantidadSolicitada);
        System.out.println("-----------------------------------");
        System.out.println("¿Hay inventario suficiente? " + hayInventarioSuficiente);
        System.out.println("¿Es exactamente igual al inventario? " + esIgualInventario);
        System.out.println("¿Supera el inventario? " + superaInventario);
    }
}