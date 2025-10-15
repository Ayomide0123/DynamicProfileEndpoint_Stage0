package com.hng.DynamicProfileEndpoint.model;

import lombok.*;

@Data
@AllArgsConstructor
public class ApiResponse {
    private String status;
    private UserProfile user;
    private String timestamp;
    private String fact;

}
