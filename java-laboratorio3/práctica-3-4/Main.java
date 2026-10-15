
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear la cuenta y mostrar los puntos iniciales
        System.out.print("Titular de la cuenta: ");
        String nombre = scanner.nextLine();

        CuentaPuntos cuenta = new CuentaPuntos(nombre);

        System.out.println("Puntos iniciales: " + cuenta.getPuntos());
        System.out.println("-----------------------------------");

        // 2. Solicitar y registrar la primera cantidad
        System.out.print("Ingrese la primera cantidad a sumar: ");
        int cant1 = scanner.nextInt();

        boolean res1 = cuenta.sumarPuntos(cant1);

        System.out.println(res1
                ? "Operación 1 registrada con éxito."
                : "Error: La cantidad debe ser positiva.");

        // 3. Solicitar y registrar la segunda cantidad
        System.out.print("Ingrese la segunda cantidad a sumar: ");
        int cant2 = scanner.nextInt();

        boolean res2 = cuenta.sumarPuntos(cant2);

        System.out.println(res2
                ? "Operación 2 registrada con éxito."
                : "Error: La cantidad debe ser positiva.");

        System.out.println("-----------------------------------");

        // 4. Mostrar los puntos finales
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Puntos finales: " + cuenta.getPuntos());

        scanner.close();
    }
}

// Clase CuentaPuntos
class CuentaPuntos {

    private String titular;
    private int puntos;

    public CuentaPuntos(String titular) {
        this.titular = titular;
        this.puntos = 0;
    }

    public String getTitular() {
        return titular;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean sumarPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
            return true;
        } else {
            return false;
        }
    }
}
