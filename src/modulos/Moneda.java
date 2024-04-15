package modulos;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("target_code")
    private String targetCode;
    @SerializedName("conversion_rate")
    private double conversionRate;

    public Moneda(String baseCode, String targetCode, double conversionRate) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.conversionRate = conversionRate;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
