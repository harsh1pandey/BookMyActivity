package com.bookMyActivity.book_my_activity.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Document(collection = "activities")
@Data
@NoArgsConstructor
public class Activity {
    @Id
    private String id;
    private String title;
    private String description;
    private String category;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<DayOfWeek> dayOfWeek;
    private LocalTime time;
    private Integer duration; // in minutes
    private String location;
    private Integer minAge;
    private Integer maxAge;
    private Integer maxParticipants;
    private Status status;
    private Double price;
    private List<String> imageUrls;
    
    @DBRef
    private List<User> users;

    public enum DayOfWeek {
        M, T, W, Th, F, S, Su
    }

    public enum Status {
        ACTIVE, INACTIVE, CANCELLED
    }
}