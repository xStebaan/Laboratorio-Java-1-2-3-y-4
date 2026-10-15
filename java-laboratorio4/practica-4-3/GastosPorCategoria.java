import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GastosPorCategoria {
    public static void main(String[] args) {
        List<Movimiento> movimientos = new ArrayList<>();

        movimientos.add(new Movimiento("GASTO", "Transporte", 30000));
        movimientos.add(new Movimiento("GASTO", "Alimentación", 45000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 20000));
        movimientos.add(new Movimiento("INGRESO", "Salario", 1500000));
        movimientos.add(new Movimiento("GASTO", "Salud", 40000));

        Map<String, Double> gastosTotales = new HashMap<>();

        for (Movimiento m : movimientos) {
            if (m.getTipo().equals("GASTO")) {
                double anterior = gastosTotales.getOrDefault(m.getCategoria(), 0.0);
                gastosTotales.put(m.getCategoria(), anterior + m.getValor());
            }
        }

        System.out.println("--- Gastos agrupados por categoría ---");
        for (Map.Entry<String, Double> entrada : gastosTotales.entrySet()) {
            System.out.println(entrada.getKey() + ": $" + entrada.getValue());
        }
    }
}