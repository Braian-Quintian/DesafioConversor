package api;

import com.google.gson.Gson;
import modulos.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitudDeTasa {
    public Moneda convertirMoneda(String monedaOrigen, String monedaDestino) {
        try (HttpClient client = HttpClient.newHttpClient()) {
            String BASE_URL = "https://v6.exchangerate-api.com/v6/ac092da1a0b26b6ecfe9d23d";
            String urlString = BASE_URL + "/pair/" + monedaOrigen + "/" + monedaDestino;
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            Moneda moneda = gson.fromJson(json, Moneda.class);
            validarMoneda(moneda);
            return moneda;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new Moneda("", "", 0);
        }
    }

    private void validarMoneda(Moneda moneda) throws IllegalArgumentException {
        if (moneda == null) {
            throw new IllegalArgumentException("La moneda recibida es nula");
        }

        if (moneda.getBaseCode() == null || moneda.getTargetCode() == null) {
            throw new IllegalArgumentException("Alguno de los campos baseCode o targetCode es nulo.");
        }

        if (moneda.getConversionRate() <= 0) {
            throw new IllegalArgumentException("conversionRate no válido.");
        }
    }
}
