public class GuardarComparacion {

    public static void main(String[] args) {
        System.out.println("=== ESCENARIO 1: Dinero suficiente ===");
        double saldo1 = 200000;
        double compra1 = 150000;
        
        // Guardamos la comparación en un booleano
        boolean puedeComprar1 = saldo1 >= compra1;
        System.out.println("¿Puede comprar? " + puedeComprar1); // Debería imprimir true

        System.out.println("\n=== ESCENARIO 2: Dinero insuficiente ===");
        double saldo2 = 100000;
        double compra2 = 150000;
        
        // Evaluamos con otros valores
        boolean puedeComprar2 = saldo2 >= compra2;
        System.out.println("¿Puede comprar? " + puedeComprar2); // Debería imprimir false
    }
}
