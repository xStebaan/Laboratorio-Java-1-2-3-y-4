import java.util.ArrayList;
import java.util.List;

public class RegistroCaja {
    public static void main(String[] args) {
        List<Movimiento> caja = new ArrayList<>();

        // Crear cuatro movimientos (ingresos y gastos)
        caja.add(new Movimiento("INGRESO", "Venta", 200000));
        caja.add(new Movimiento("GASTO", "Servicios", 80000));
        caja.add(new Movimiento("INGRESO", "Freelance", 400000));
        caja.add(new Movimiento("GASTO", "Comida", 35000));

        // Imprimirlos numerados
        System.out.println("--- Registro de Movimientos ---");
        for (int i = 0; i < caja.size(); i++) {
            Movimiento m = caja.get(i);
            System.out.println((i + 1) + ". " + m.getTipo() + " - " + m.getCategoria() + ": $" + m.getValor());
        }

        // Calcular total de ingresos y gastos
        double totalIngresos = 0;
        double totalGastos = 0;

        for (Movimiento m : caja) {
            if (m.getTipo().equals("INGRESO")) {
                totalIngresos += m.getValor();
            } else if (m.getTipo().equals("GASTO")) {
                totalGastos += m.getValor();
            }
        }

        System.out.println("\n--- Resumen de Caja ---");
        System.out.println("Total de ingresos: $" + totalIngresos);
        System.out.println("Total de gastos: $" + totalGastos);
        System.out.println("Cantidad total de movimientos: " + caja.size());
    }
}