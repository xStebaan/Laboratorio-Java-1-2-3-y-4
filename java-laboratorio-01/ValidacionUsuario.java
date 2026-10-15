public class ValidacionUsuario {

    public static void main(String[] args) {
        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        // 1. Comparación estricta con equals()
        boolean esIgualEstricto = usuarioRegistrado.equals(usuarioIngresado);
        System.out.println("Resultado con .equals(): " + esIgualEstricto);

        // 2. Comparación ignorando mayúsculas con equalsIgnoreCase()
        boolean esIgualFlexible = usuarioRegistrado.equalsIgnoreCase(usuarioIngresado);
        System.out.println("Resultado con .equalsIgnoreCase(): " + esIgualFlexible);

    } 
}