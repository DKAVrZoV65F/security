package org.spring.security.controller.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistryRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
