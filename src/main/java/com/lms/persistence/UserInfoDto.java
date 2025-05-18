package com.lms.persistence;
import lombok.Data;

@Data
public class UserInfoDto {
    // Getters and Setters
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // Constructor
    public UserInfoDto(String id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

}
