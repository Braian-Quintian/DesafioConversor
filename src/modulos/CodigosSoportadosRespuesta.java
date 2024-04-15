package modulos;

import java.util.List;

public class CodigosSoportadosRespuesta {
    private final List<List<String>> supported_codes;

    public CodigosSoportadosRespuesta(List<List<String>> supportedCodes) {
        supported_codes = supportedCodes;
    }

    public List<List<String>> getSupportedCodes() {
        return supported_codes;
    }
}