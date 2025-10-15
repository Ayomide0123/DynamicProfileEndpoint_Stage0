package com.hng.DynamicProfileEndpoint.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class FetchCatFactService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String getRandomCatFact() {
        String CAT_FACT_URL = "https://catfact.ninja/fact";
        Map<String, Object> response = restTemplate.getForObject(CAT_FACT_URL, Map.class);
        return response != null ? (String) response.get("fact") : "No fact available. Try again!";
    }
}
