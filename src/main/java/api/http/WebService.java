package api.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class WebService {
    public static void webServiceExample() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        var search = scanner.nextLine();
        var formattedSearch = search.replace(" ", "-");

        HttpClient client = HttpClient.newHttpClient();
        String url = "https://www.omdbapi.com/?apikey=81527f1a&s=" + formattedSearch;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}