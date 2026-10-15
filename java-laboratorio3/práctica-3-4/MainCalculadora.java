import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Crear el objeto Calculadora (responsabilidad de cálculo separada)
        Calculadora calc = new Calculadora();

        // Obtener los resultados desde los métodos
        double resultadoSuma = calc.sumar(num1, num2);
        double resultadoResta = calc.restar(num1, num2);
        double resultadoMultiplicacion = calc.multiplicar(num1, num2);

        // Mostrar resultados desde la interfaz de usuario (Main)
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        scanner.close();
    }
}