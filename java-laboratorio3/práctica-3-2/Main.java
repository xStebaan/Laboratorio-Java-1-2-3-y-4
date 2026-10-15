public class Main {
    public static void main(String[] args) {
        Termometro term1 = new Termometro(0);
        Termometro term2 = new Termometro(25);

        term1.mostrarCelsius();
        System.out.println(" -> " + term1.convertirAFahrenheit() + " °F");

        term2.mostrarCelsius();
        System.out.println(" -> " + term2.convertirAFahrenheit() + " °F");
    }
}