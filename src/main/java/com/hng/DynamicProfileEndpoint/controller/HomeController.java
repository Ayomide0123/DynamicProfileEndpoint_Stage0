package com.hng.DynamicProfileEndpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Welcome() {
        return """
            <html>
              <body style='font-family: Arial; line-height: 1.6;'>
                <h3>Welcome to the Cat Fact Profile API</h3>
                <p>This is a simple RESTful API built with Spring Boot.</p>
                <h5>Available Endpoints:</h5>
                <pre>GET /me → Returns a user profile info with a random cat fact</pre>
                <p>Enjoy exploring the API! :)</p>
              </body>
            </html>
            """;
    }
}
