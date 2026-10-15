import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();

        // Introducir cuatro tareas
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la tarea " + (i + 1) + ": ");
            tareas.add(scanner.nextLine());
        }

        // Mostrar tareas numeradas
        System.out.println("\n--- Lista de Tareas ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        // Consultar cantidad
        System.out.println("Cantidad total de tareas: " + tareas.size());

        // Comprobar si existe una tarea
        System.out.print("\nIngrese una tarea a buscar: ");
        String buscar = scanner.nextLine();
        if (tareas.contains(buscar)) {
            System.out.println("La tarea '" + buscar + "' SÍ existe en la lista.");
        } else {
            System.out.println("La tarea '" + buscar + "' NO existe en la lista.");
        }

        // Eliminar una tarea por su nombre si está registrada
        System.out.print("\nIngrese una tarea a eliminar: ");
        String eliminar = scanner.nextLine();
        if (tareas.remove(eliminar)) {
            System.out.println("Tarea eliminada con éxito.");
        } else {
            System.out.println("No se encontró la tarea para eliminar.");
        }

        // Mostrar lista actualizada
        System.out.println("\n--- Lista Actualizada ---");
        System.out.println(tareas);

        scanner.close();
    }
}