package api.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static api.http.OMDbResponseHandler.gsonHandler;

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

        String json = response.body();

        OMDbTitle[] titles = gsonHandler(json);
        if (titles != null){
            System.out.println("Total results: " + titles.length);
            for (OMDbTitle title : titles) {
                System.out.println(title.title() + " (" + title.year() + ")");
                System.out.println(title);
            }
        } else {
            System.out.println("No results found.");
        }

        for (OMDbTitle omdbTitle : titles) {
            // Title title = new Title(omdbTitle.title(), omdbTitle.year()); // Casting is required
            Title title = new Title(omdbTitle);
            System.out.println("Created title: " + title.title + ", year: " + title.year);
        }
    }
}