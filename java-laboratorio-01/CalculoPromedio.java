public class CalculoPromedio {

    public static void main(String[] args) {
        int nota1 = 4;
        int nota2 = 5;
        int nota3 = 3;

        // Sumamos las notas y dividimos entre 3.0 (un número decimal) 
        // para asegurarnos de que la división no trunque los decimales.
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("=== CÁLCULO DE PROMEDIO ===");
        System.out.println("Calificación 1: " + nota1);
        System.out.println("Calificación 2: " + nota2);
        System.out.println("Calificación 3: " + nota3);
        System.out.println("El promedio final es: " + promedio);
    }
}