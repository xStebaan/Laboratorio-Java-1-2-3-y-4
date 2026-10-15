import java.util.Scanner;

public class NotasArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\n--- Listado de Calificaciones ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posición " + i + " -> " + notas[i]);
        }

        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];
        int aprobadas = 0;

        for (double nota : notas) {
            suma += nota;
            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
            if (nota >= 3.0) {
                aprobadas++;
            }
        }

        double promedio = suma / notas.length;

        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Cantidad de notas aprobadas (>= 3.0): " + aprobadas);

        scanner.close();
    }
}