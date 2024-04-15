package utils;

import api.SolicitudDeMoneda;
import modulos.CodigosMoneda;

import java.util.List;
import java.util.Scanner;

public class OpcionesMoneda {
    public static String mostrarMasOpciones(){
        SolicitudDeMoneda solicitud = new SolicitudDeMoneda();
        List<CodigosMoneda> codigos = solicitud.getCodigos();
        System.out.println("Seleccione una de las siguientes opciones:");
        int index = 1;
        for (CodigosMoneda codigo : codigos) {
            System.out.println("[" + index + "] -> " + codigo.nombre());
            index++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número correspondiente a la opción: ");

        while (!sc.hasNextInt()) {
            System.out.print("Por favor, ingresa un número válido: ");
            sc.next(); // Limpiar la entrada no válida del scanner
        }

        int opcion = sc.nextInt();
        if (opcion > 0 && opcion <= codigos.size()) {
            return codigos.get(opcion - 1).codigo();
        } else {
            System.out.println("Opción no válida. Por favor, ingresa un número válido.\n");
            return null;
        }
    }
}