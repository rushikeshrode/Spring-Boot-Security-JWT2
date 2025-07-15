package com.rush.jwt2.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String username;
    private String password;
    private String confirmPassword;
    private String role;

}
