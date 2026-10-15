import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Billetera {
    private final String titular;
    private double saldo;
    private int cantidadIngresos;
    private double totalIngresos;
    private int cantidadGastos;
    private double totalGastos;
    private List<Movimiento> movimientos;

    public Billetera(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("El titular es obligatorio.");
        }
        this.titular = titular.trim();
        this.saldo = 0.0;
        this.cantidadIngresos = 0;
        this.totalIngresos = 0.0;
        this.cantidadGastos = 0;
        this.totalGastos = 0.0;
        this.movimientos = new ArrayList<>();
    }

    public boolean registrarIngreso(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        if (categoria == null || categoria.isBlank()) {
            return false;
        }

        // Validación exitosa: se crea el movimiento y se actualiza el estado
        Movimiento mov = new Movimiento("INGRESO", categoria, valor);
        this.saldo += valor;
        this.cantidadIngresos++;
        this.totalIngresos += valor;
        this.movimientos.add(mov);
        return true;
    }

    public boolean registrarGasto(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        if (categoria == null || categoria.isBlank()) {
            return false;
        }
        if (valor > this.saldo) {
            return false; // Rechazado por saldo insuficiente
        }

        Movimiento mov = new Movimiento("GASTO", categoria, valor);
        this.saldo -= valor;
        this.cantidadGastos++;
        this.totalGastos += valor;
        this.movimientos.add(mov);
        return true;
    }

    public List<Movimiento> getMovimientos() {
        // Devuelve una copia superficial para proteger la lista interna
        return new ArrayList<>(movimientos);
    }

    public List<Movimiento> buscarPorTipo(String tipo) {
        List<Movimiento> encontrados = new ArrayList<>();
        if (tipo == null) return encontrados;
        String tipoUpper = tipo.trim().toUpperCase();
        for (Movimiento m : movimientos) {
            if (m.getTipo().equals(tipoUpper)) {
                encontrados.add(m);
            }
        }
        return encontrados;
    }

    public Set<String> categoriasUtilizadas() {
        Set<String> categorias = new HashSet<>();
        for (Movimiento movimiento : movimientos) {
            categorias.add(movimiento.getCategoria());
        }
        return categorias;
    }

    public Map<String, Double> gastosPorCategoria() {
        Map<String, Double> totales = new HashMap<>();
        for (Movimiento movimiento : movimientos) {
            if (movimiento.getTipo().equals("GASTO")) {
                double acumulado = totales.getOrDefault(movimiento.getCategoria(), 0.0);
                totales.put(movimiento.getCategoria(), acumulado + movimiento.getValor());
            }
        }
        return totales;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCantidadIngresos() {
        return cantidadIngresos;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public int getCantidadGastos() {
        return cantidadGastos;
    }

    public double getTotalGastos() {
        return totalGastos;
    }
}