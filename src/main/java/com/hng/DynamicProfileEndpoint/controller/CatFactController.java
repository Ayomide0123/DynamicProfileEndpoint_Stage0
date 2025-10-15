package com.hng.DynamicProfileEndpoint.controller;

import com.hng.DynamicProfileEndpoint.model.ApiResponse;
import com.hng.DynamicProfileEndpoint.model.UserProfile;
import com.hng.DynamicProfileEndpoint.service.FetchCatFactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

@RestController
public class CatFactController {
    private final FetchCatFactService fetchCatFactService;

    public CatFactController(FetchCatFactService fetchCatFactService) {
        this.fetchCatFactService = fetchCatFactService;
    }

    @GetMapping("/me")
    public ApiResponse getProfile() {
        String catFact = fetchCatFactService.getRandomCatFact();

        UserProfile user = new UserProfile(
                "oyetimehin31@gmail.com",
                "Oyetimehin Ayomide",
                "Java/SpringBoot"
        );

        String timestamp = DateTimeFormatter.ISO_INSTANT.format(Instant.now());

        return new ApiResponse("success", user, timestamp, catFact);
    }
}
