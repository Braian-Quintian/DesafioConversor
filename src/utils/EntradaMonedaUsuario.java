package utils;

import java.util.Scanner;

public class EntradaMonedaUsuario {
    private String monedaSeleccionada;

    public EntradaMonedaUsuario(String message,String monedaOrigen) {
        Scanner sc = new Scanner(System.in);
        String menu = "Por favor, seleccione la moneda de " + message + "\n" +
                """
                [1] -> Peso argentino
                [2] -> Boliviano boliviano
                [3] -> Real brasileño
                [4] -> Peso chileno
                [5] -> Peso colombiano
                [6] -> Dólar estadounidense
                [7] -> mostrar más opciones
                """;

        while (this.monedaSeleccionada == null) {
            System.out.println(menu);
            System.out.print("Ingrese el número correspondiente a la moneda de " + message + ": ");

            // Validación para asegurarse de que se ingrese un entero
            while (!sc.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                sc.next(); // Limpiar la entrada no válida del scanner
            }

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    monedaSeleccionada = "ARS";
                    break;
                case 2:
                    monedaSeleccionada = "BOB";
                    break;
                case 3:
                    monedaSeleccionada = "BRL";
                    break;
                case 4:
                    monedaSeleccionada = "CLP";
                    break;
                case 5:
                    monedaSeleccionada = "COP";
                    break;
                case 6:
                    monedaSeleccionada = "USD";
                    break;
                case 7:
                    monedaSeleccionada = OpcionesMoneda.mostrarMasOpciones();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa un número válido.\n");
                    break;
            }
            if (monedaSeleccionada != null && monedaSeleccionada.equals(monedaOrigen)) {
                System.out.println("La moneda seleccionada es la misma que la moneda de origen. Elige otra.\n");
                this.monedaSeleccionada = null;
            }
        }
    }

    public String getMonedaSeleccionada() {
        return monedaSeleccionada;
    }
}