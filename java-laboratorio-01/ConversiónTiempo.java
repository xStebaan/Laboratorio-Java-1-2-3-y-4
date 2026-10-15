public class ConversiónTiempo {

    public static void main(String[] args) {
        int totalMinutos = 367;
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("Total minutos: " + totalMinutos);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes: " + minutos);
    }
}