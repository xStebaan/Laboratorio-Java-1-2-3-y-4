public class Termometro {
    double temperaturaCelsius;

    // Constructor que recibe la temperatura inicial
    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    void mostrarCelsius() {
        System.out.print(temperaturaCelsius + " °C");
    }

    double convertirAFahrenheit() {
        return (temperaturaCelsius * 9.0 / 5.0) + 32;
    }
}