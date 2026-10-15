import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular de la billetera: ");
        String titular = scanner.nextLine();
        
        Billetera billetera;
        try {
            billetera = new Billetera(titular);
        } catch (IllegalArgumentException e) {
            System.out.println("Titular inválido. Se asignará 'Usuario'.");
            billetera = new Billetera("Usuario");
        }

        int opcion = -1;

        do {
            System.out.println("\n================================================");
            System.out.println("               MI BILLETERA JAVA                ");
            System.out.println("================================================");
            System.out.println("Titular: " + billetera.getTitular());
            System.out.println("Saldo disponible: $" + billetera.getSaldo());
            System.out.println("\n1. Registrar ingreso");
            System.out.println("2. Registrar gasto");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Mostrar movimientos");
            System.out.println("5. Consultar movimientos por tipo");
            System.out.println("6. Consultar categorías utilizadas");
            System.out.println("7. Resumen financiero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            String entradaOpcion = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entradaOpcion.trim());

                switch (opcion) {
                    case 1:
                        System.out.print("Categoría del ingreso: ");
                        String catIngreso = scanner.nextLine();
                        System.out.print("Valor del ingreso: ");
                        double valIngreso = leerMontoSeguro(scanner);
                        
                        boolean exitoIngreso = billetera.registrarIngreso(valIngreso, catIngreso);
                        if (exitoIngreso) {
                            System.out.println("¡Ingreso registrado con éxito!");
                        } else {
                            System.out.println("Operación rechazada: Datos inválidos.");
                        }
                        break;

                    case 2:
                        System.out.print("Categoría del gasto: ");
                        String catGasto = scanner.nextLine();
                        System.out.print("Valor del gasto: ");
                        double valGasto = leerMontoSeguro(scanner);
                        
                        boolean exitoGasto = billetera.registrarGasto(valGasto, catGasto);
                        if (exitoGasto) {
                            System.out.println("¡Gasto registrado con éxito!");
                        } else {
                            System.out.println("Operación rechazada: Saldo insuficiente o datos inválidos.");
                        }
                        break;

                    case 3:
                        System.out.println("Saldo actual disponible: $" + billetera.getSaldo());
                        break;

                    case 4:
                        List<Movimiento> historial = billetera.getMovimientos();
                        System.out.println("\n================================================");
                        System.out.println("                   HISTORIAL                    ");
                        System.out.println("================================================");
                        if (historial.isEmpty()) {
                            System.out.println("El historial está vacío.");
                        } else {
                            for (int i = 0; i < historial.size(); i++) {
                                Movimiento m = historial.get(i);
                                System.out.println((i + 1) + ". " + m.getTipo() + " | " + m.getCategoria() + " | $" + m.getValor());
                            }
                        }
                        break;

                    case 5:
                        System.out.print("Ingrese el tipo a consultar (INGRESO / GASTO): ");
                        String tipoFiltro = scanner.nextLine().toUpperCase().trim();
                        List<Movimiento> filtrados = billetera.buscarPorTipo(tipoFiltro);
                        System.out.println("\n--- Movimientos de tipo: " + tipoFiltro + " ---");
                        if (filtrados.isEmpty()) {
                            System.out.println("No hay movimientos registrados para este tipo.");
                        } else {
                            for (int i = 0; i < filtrados.size(); i++) {
                                Movimiento m = filtrados.get(i);
                                System.out.println((i + 1) + ". " + m.getCategoria() + " - $" + m.getValor());
                            }
                        }
                        break;

                    case 6:
                        Set<String> categorias = billetera.categoriasUtilizadas();
                        System.out.println("\n--- Categorías utilizadas ---");
                        if (categorias.isEmpty()) {
                            System.out.println("No hay categorías registradas aún.");
                        } else {
                            for (String cat : categorias) {
                                System.out.println("- " + cat);
                            }
                        }
                        break;

                    case 7:
                        System.out.println("\n================================================");
                        System.out.println("               RESUMEN FINANCIERO               ");
                        System.out.println("================================================");
                        System.out.println("Titular: " + billetera.getTitular());
                        System.out.println("Saldo: $" + billetera.getSaldo());
                        System.out.println("Ingresos realizados: " + billetera.getCantidadIngresos());
                        System.out.println("Total ingresado: $" + billetera.getTotalIngresos());
                        System.out.println("Gastos realizados: " + billetera.getCantidadGastos());
                        System.out.println("Total gastado: $" + billetera.getTotalGastos());
                        
                        Map<String, Double> gastosCat = billetera.gastosPorCategoria();
                        System.out.println("\nGastos por categoría:");
                        if (gastosCat.isEmpty()) {
                            System.out.println("No hay gastos registrados.");
                        } else {
                            for (Map.Entry<String, Double> entry : gastosCat.entrySet()) {
                                System.out.println("- " + entry.getKey() + ": $" + entry.getValue());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción desconocida. Seleccione un número válido del menú.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar una opción numérica válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static double leerMontoSeguro(Scanner scanner) {
        while (true) {
            String entrada = scanner.nextLine();
            try {
                double valor = Double.parseDouble(entrada.trim());
                if (!Double.isFinite(valor) || valor <= 0) {
                    System.out.print("El monto debe ser positivo y finito. Intente de nuevo: ");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un valor numérico: ");
            }
        }
    }
}