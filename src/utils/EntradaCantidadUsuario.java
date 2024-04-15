package utils;

import java.util.Scanner;

public class EntradaCantidadUsuario {
    private final double cantidad;

    public EntradaCantidadUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad que desea convertir: ");

        while (true) {
            if (sc.hasNextDouble()) {
                cantidad = sc.nextDouble();
                break;
            } else {
                System.out.print("Entrada no válida. Por favor, ingrese un número válido: ");
                sc.next();
            }
        }
    }

    public double getCantidad() {
        return cantidad;
    }
}