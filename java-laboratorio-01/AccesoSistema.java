import java.util.Scanner;

public class AccesoSistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Credenciales predefinidas para la validación
        String usuarioCorrecto = "admin";
        String claveCorrecta = "java21";

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String claveIngresada = scanner.nextLine();

        // Validar ambas condiciones con && y usando .equals() para los String
        if (usuarioIngresado.equals(usuarioCorrecto) && claveIngresada.equals(claveCorrecta)) {
            System.out.println("¡Acceso concedido! Credenciales correctas.");
        } else {
            System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}