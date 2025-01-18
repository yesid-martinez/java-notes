package api.http;
import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;

import static api.http.OMDbResponseHandler.gsonHandler;

public class WebService {
    public static void webServiceExample(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        var search = scanner.nextLine();
        var formattedSearch = search.replace(" ", "-");

        String url = "https://www.omdbapi.com/?apikey=81527f1a&s=" + formattedSearch;

        try {
            // Crear cliente y solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Enviar solicitud y obtener respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            // Procesar la respuesta JSON
            OMDbTitle[] titles = gsonHandler(json);
            if (titles != null && titles.length > 0) {
                System.out.println("Total results: " + titles.length);
                for (OMDbTitle title : titles) {
                    System.out.println(title.title() + " (" + title.year() + ")");
                }

                // Crear instancias de Title a partir de OMDbTitle
                for (OMDbTitle omdbTitle : titles) {
                    Title title = new Title(omdbTitle);
                    System.out.println("Created title: " + title.title + ", year: " + title.year);
                }
            } else {
                System.out.println("No results found.");
            }


        } catch (IOException e) {
            System.err.println("Error connecting to the server: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Operation was interrupted: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}