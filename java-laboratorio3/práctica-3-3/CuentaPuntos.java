public class CuentaPuntos {
    private String titular;
    private int puntos;

    public CuentaPuntos(String titular) {
        this.titular = titular;
        this.puntos = 0; // Inicia en cero
    }

    public String getTitular() {
        return titular;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean sumarPuntos(int cantidad) {
        if (cantidad <= 0) {
            return false; // Rechaza cantidades no positivas
        }
        puntos += cantidad;
        return true;
    }

    public boolean canjearPuntos(int cantidad) {
        if (cantidad <= 0 || cantidad > puntos) {
            return false; // Rechaza si no es positivo o supera los puntos disponibles
        }
        puntos -= cantidad;
        return true;
    }
}