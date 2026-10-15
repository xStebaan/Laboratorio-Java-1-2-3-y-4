public class MainEst {
    public static void main(String[] args) {
        // Estudiante con promedio reprobatorio
        Estudiante est1 = new Estudiante("Carlos Ruiz", "312456", 2, 2.8);

        // Estudiante con promedio aprobatorio
        Estudiante est2 = new Estudiante("Lucía Gómez", "312456", 2, 4.1);

        est1.mostrarPerfil();
        System.out.println("¿Aprobó?: " + est1.aprobo());
        System.out.println("-----------------------------");

        est2.mostrarPerfil();
        System.out.println("¿Aprobó?: " + est2.aprobo());
    }
}