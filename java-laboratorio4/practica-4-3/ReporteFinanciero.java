import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReporteFinanciero {
    public static void main(String[] args) {
        List<Movimiento> movimientos = new ArrayList<>();

        // 6 movimientos: 2 ingresos, 4 gastos (con categoría repetida)
        movimientos.add(new Movimiento("INGRESO", "Salario", 2000000));
        movimientos.add(new Movimiento("INGRESO", "Freelance", 500000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 30000));
        movimientos.add(new Movimiento("GASTO", "Alimentación", 60000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 25000)); // Repetida
        movimientos.add(new Movimiento("GASTO", "Entretenimiento", 80000));

        // 1. Todas las categorías utilizadas, sin repetir
        Set<String> todasCategorias = new HashSet<>();
        // 2. Únicamente las categorías de gastos, sin repetir
        Set<String> categoriasGastos = new HashSet<>();
        // 3. Importe total de gastos por categoría
        Map<String, Double> gastosPorCategoria = new HashMap<>();

        for (Movimiento m : movimientos) {
            todasCategorias.add(m.getCategoria());
            if (m.getTipo().equals("GASTO")) {
                categoriasGastos.add(m.getCategoria());
                double anterior = gastosPorCategoria.getOrDefault(m.getCategoria(), 0.0);
                gastosPorCategoria.put(m.getCategoria(), anterior + m.getValor());
            }
        }

        System.out.println("=== REPORTE FINANCIERO ===");
        System.out.println("Todas las categorías (sin repetir): " + todasCategorias);
        System.out.println("Categorías de gastos (sin repetir): " + categoriasGastos);
        
        System.out.println("\nImporte total de gastos por categoría:");
        for (Map.Entry<String, Double> entrada : gastosPorCategoria.entrySet()) {
            System.out.println("- " + entrada.getKey() + ": $" + entrada.getValue());
        }

        System.out.println("\nCantidad de categorías de gastos distintos: " + categoriasGastos.size());
    }
}