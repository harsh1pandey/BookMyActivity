package com.bookMyActivity.book_my_activity.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private LocalDate dateOfBirth;
    private String profilePictureUrl;
    private String bio;
    private List<String> alertsForCategories;
    
    public enum Role {
        ADMIN, TEACHER, STUDENT
    }
}