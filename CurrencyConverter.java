import org.json.JSONObject;

public class CurrencyConverter {
    private ApiClient apiClient;

    public CurrencyConverter() {
        this.apiClient = new ApiClient();
    }

    public double convert(String baseCurrency, String targetCurrency, double amount) throws IOException, InterruptedException {
        String response = apiClient.getExchangeRate(baseCurrency, targetCurrency);
        JSONObject jsonObject = new JSONObject(response);
        double exchangeRate = jsonObject.getDouble("conversion_rate");
        return amount * exchangeRate;
    }
}
