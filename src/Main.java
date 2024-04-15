import api.SolicitudDeTasa;
import calculos.Convertidor;
import utils.EntradaCantidadUsuario;
import modulos.Moneda;
import utils.EntradaMonedaUsuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("******************************************");
            System.out.println("Bienvenido al Conversor de Moneda");
            System.out.println("******************************************\n");

            EntradaMonedaUsuario entradaOrigen = new EntradaMonedaUsuario("origen",null);
            String monedaOrigen = entradaOrigen.getMonedaSeleccionada();

            EntradaMonedaUsuario entradaDestino = new EntradaMonedaUsuario("destino",monedaOrigen);
            String monedaDestino = entradaDestino.getMonedaSeleccionada();

            EntradaCantidadUsuario entradaCantidadUsuario = new EntradaCantidadUsuario();
            double cantidad = entradaCantidadUsuario.getCantidad();

            SolicitudDeTasa solicitudDeConversion = new SolicitudDeTasa();
            Moneda resultado = solicitudDeConversion.convertirMoneda(monedaOrigen, monedaDestino);
            String  cantidadConvertida = Convertidor.convertir(resultado, cantidad);

            System.out.println("\n****************************************************************************");
            System.out.println("¡Conversión exitosa!");
            System.out.println("El valor de " + cantidad + " [" + monedaOrigen + "] es " + cantidadConvertida + " [" + monedaDestino + "]");

            System.out.print("\n¿Desea realizar otra conversión? (s/n): ");
            String continuar = scanner.nextLine().trim().toLowerCase();

            while (!continuar.equals("s") && !continuar.equals("n")) {
                System.out.println("Por favor, ingrese solo 's' para continuar o 'n' para salir:");
                continuar = scanner.nextLine().trim().toLowerCase();
            }

            if (continuar.equals("n")) {
                System.out.println("¡Gracias por usar nuestro conversor de moneda!");
                break;
            }
        } while (true);
    }
}
