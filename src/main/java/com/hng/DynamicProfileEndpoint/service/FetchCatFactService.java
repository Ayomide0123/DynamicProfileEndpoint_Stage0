package com.hng.DynamicProfileEndpoint.service;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class FetchCatFactService {

    private final RestTemplate restTemplate;
    String CAT_FACT_URL = "https://catfact.ninja/fact";

    public FetchCatFactService() {
//        Timeout Configuration
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(4000);
        factory.setReadTimeout(4000);

        this.restTemplate = new RestTemplate(factory);
    }

    public String getRandomCatFact() {
        try {
            Map<String, Object> response = restTemplate.getForObject(CAT_FACT_URL, Map.class);
            if (response != null && response.containsKey("fact")) {
                return (String) response.get("fact");
            } else {
                return "No cat fact is available at the moment!";
            }
        } catch (RestClientException e) {
            System.err.println("Error fetching cat fact: " + e.getMessage());
            return "Could not fetch cat fact. Please try again later!";
        }
    }
}
