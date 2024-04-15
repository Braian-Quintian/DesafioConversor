package api;

import com.google.gson.Gson;
import modulos.CodigosMoneda;
import modulos.SupportedCodesResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class SolicitudDeMoneda {
    public List<CodigosMoneda> getCodigos() {
        List<CodigosMoneda> codigosList = new ArrayList<>();
        try (HttpClient client = HttpClient.newHttpClient()) {
            String BASE_URL = "https://v6.exchangerate-api.com/v6/ac092da1a0b26b6ecfe9d23d";
            String urlString = BASE_URL + "/codes";
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlString)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Gson gson = new Gson();
            SupportedCodesResponse supportedCodesResponse = gson.fromJson(json, SupportedCodesResponse.class);
            for (List<String> code : supportedCodesResponse.getSupportedCodes()) {
                codigosList.add(new CodigosMoneda(code.get(0), code.get(1)));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return codigosList;
    }
}