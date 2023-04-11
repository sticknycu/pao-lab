package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/delete/1"))
                .DELETE()
                .build();


        HttpClient httpClient = HttpClient.newHttpClient();

        var v = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(v.body());
    }
}