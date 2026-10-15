public class MainCont {
    public static void main(String[] args) {
        Billetera billetera = new Billetera("Laura");

        boolean i1 = billetera.registrarIngreso(100000);
        boolean i2 = billetera.registrarIngreso(-2000);
        boolean g1 = billetera.registrarGasto(30000);
        boolean g2 = billetera.registrarGasto(90000);

        System.out.println("Ingresar 100000   -> " + (i1 ? "aceptado" : "rechazado"));
        System.out.println("Ingresar -2000    -> " + (i2 ? "aceptado" : "rechazado"));
        System.out.println("Gastar 30000      -> " + (g1 ? "aceptado" : "rechazado"));
        System.out.println("Gastar 90000      -> " + (g2 ? "aceptado" : "rechazado"));

        System.out.println("\nCantidad de ingresos: " + billetera.getCantidadIngresos());
        System.out.println("Cantidad de gastos: " + billetera.getCantidadGastos());
        System.out.println("Saldo: " + billetera.getSaldo());
    }
}