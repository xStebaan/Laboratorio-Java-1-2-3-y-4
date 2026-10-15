public class ArreglosBasicos {
    public static void main(String[] args) {
        String[] productos = {"Teclado", "Mouse", "Monitor"};

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println("Cantidad: " + productos.length);

       
        productos[1] = "Mouse inalámbrico";
        
        System.out.println("\nDespués de modificar:");
        System.out.println(productos[1]);
    }
}