package calculos;

import modulos.Moneda;

import java.text.DecimalFormat;

public class Convertidor {
    public static String convertir(Moneda moneda, double cantidad) {
        double conversion = cantidad * moneda.getConversionRate();

        // Formatear la cantidad convertida
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        return df.format(conversion);
    }
}