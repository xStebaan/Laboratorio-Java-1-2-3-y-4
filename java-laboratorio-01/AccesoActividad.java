public class AccesoActividad {

    public static void main(String[] args) {
        int edad = 20;
        boolean activo = true;

        // CORRECCIÓN 1: Se usa >= (o ==) para la comparación en lugar de =
        boolean mayorEdad = edad >= 18; 
        
        // CORRECCIÓN 2: Se usa el operador lógico && en lugar de &
        boolean habilitado = edad >= 18 && activo;

        System.out.println(mayorEdad); // Imprimirá true
        System.out.println(habilitado); // Imprimirá true
    }
}