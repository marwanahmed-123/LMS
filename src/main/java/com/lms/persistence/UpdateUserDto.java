package com.lms.persistence;

import lombok.Data;

@Data
public class UpdateUserDto {
    // Getters and Setters
    private String firstName;
    private String lastName;
    private String password;

}
