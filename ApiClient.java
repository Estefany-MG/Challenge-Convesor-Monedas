import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;

public class ApiClient {
    private static final String API_KEY = "TU_API_KEY";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public String getExchangeRate(String baseCurrency, String targetCurrency) throws IOException, InterruptedException {
        String url = BASE_URL + API_KEY + "/pair/" + baseCurrency + "/" + targetCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
