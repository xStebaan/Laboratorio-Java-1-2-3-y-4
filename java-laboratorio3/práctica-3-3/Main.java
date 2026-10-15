public class Main {
    public static void main(String[] args) {
        CuentaPuntos cuenta = new CuentaPuntos("Carlos");

        System.out.println("Puntos iniciales: " + cuenta.getPuntos());

        boolean r1 = cuenta.sumarPuntos(80);
        System.out.println("Sumar: 80        -> " + (r1 ? "aceptado" : "rechazado"));

        boolean r2 = cuenta.canjearPuntos(30);
        System.out.println("Canjear: 30      -> " + (r2 ? "aceptado" : "rechazado"));

        boolean r3 = cuenta.canjearPuntos(100);
        System.out.println("Canjear: 100     -> " + (r3 ? "aceptado" : "rechazado"));

        System.out.println("Puntos finales: " + cuenta.getPuntos());
    }
}