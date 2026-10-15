# Mi Billetera Java 2.0

Aplicación orientada a objetos en Java para la gestión financiera personal a través de consola, aplicando estructuras de colecciones (List, Set, Map) y manejo seguro de excepciones (try/catch).

## Propósito de las Clases
- **Movimiento.java**: Modela cada registro individual de ingreso o gasto con atributos privados, inmutables (`final`) y validados mediante excepciones.
- **Billetera.java**: Administra de forma aislada el saldo, contadores, acumuladores y el historial de transacciones aplicando reglas de negocio estrictas.
- **Main.java**: Gestiona la interacción con el usuario mediante un menú interactivo en consola resistente a fallos de entrada y errores numéricos.

## Comandos para Compilar y Ejecutar
Ubícate en la carpeta del proyecto desde tu terminal y ejecuta:
```bash
javac Movimiento.java Billetera.java Main.java
java Main