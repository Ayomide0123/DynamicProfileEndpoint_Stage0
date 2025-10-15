package com.hng.DynamicProfileEndpoint.model;

import lombok.*;

@Data
@AllArgsConstructor
public class UserProfile {
    private String email;
    private String name;
    private String stack;
}
