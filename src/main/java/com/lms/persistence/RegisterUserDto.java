package com.lms.persistence;

//public class RegisterUserDto {
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;
//    private String role; // "Student", "Instructor", or "Administrator"
//
//    // Getters and Setters
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}
import lombok.Data;

@Data
public class RegisterUserDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

}
