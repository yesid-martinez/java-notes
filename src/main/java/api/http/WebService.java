package api.http;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WebService {
    public static void webServiceExample(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        var search = scanner.nextLine();
        var formattedSearch = search.replace(" ", "-");

        String url = "https://www.omdbapi.com/?apikey=81527f1a&s=" + formattedSearch;

        try {
            // Create client and HTTP request
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Send request and get a response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            OMDbResponse prettyObjectResponse = prettyGson.fromJson(json, OMDbResponse.class);

            OMDbTitle[] prettyTitles = prettyObjectResponse.getSearch();

            String jsonTitles = prettyGson.toJson(prettyTitles);

            if (prettyTitles != null) {
                File prettyFile = new File("/home/develop/java/IdeaProjects/intellij-test/data-files/pretty-test.json");

                FileWriter prettyWriter = new FileWriter(prettyFile);
                prettyWriter.write(jsonTitles);
                prettyWriter.close();

            } else {
                System.out.println("No results found.");
            }

            Gson gson = new GsonBuilder().create();
            File file = new File("/home/develop/java/IdeaProjects/intellij-test/data-files/test.json");
            FileWriter writer = new FileWriter(file);

            OMDbResponse objectResponse = gson.fromJson(json, OMDbResponse.class);
            OMDbTitle[] defaultTitles = objectResponse.getSearch();
            String stringTitles = gson.toJson(defaultTitles);

            writer.write(stringTitles);
            writer.close();

            if (defaultTitles != null) {
                for (OMDbTitle title : defaultTitles) {
                    System.out.println(title.title() + " (" + title.year() + ")");
                }

                // Create Title instances from OMDbTitle
/*                for (OMDbTitle title : defaultTitles) {
                    Title titleObj = new Title(title);
                    System.out.println("Title: " + titleObj.title + ", year: " + titleObj.year);
                }*/

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