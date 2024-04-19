package entities;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverterCoin {
    private double getConversionResult;

    public double getGetConversionResult() {
        return getConversionResult;
    }

    private final Gson gson = new Gson();

    public ConverterCoin(String coinIn, String coinOut, double amount) {
        String url = "https://v6.exchangerate-api.com/v6/53ed20e2bf25aa0b84c1e8f2/pair/" + coinIn + "/" + coinOut + "/" + amount;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            ConvertedCoin convertedCoin = gson.fromJson(json, ConvertedCoin.class);
            System.out.println("Valor da Conversão: " + convertedCoin.conversionResult());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


