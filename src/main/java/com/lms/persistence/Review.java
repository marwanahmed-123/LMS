package com.lms.persistence;

import lombok.Data;

@Data
public class Review {
    private String userId;
    private String comment;
    private double rating;

    public Review(String userId, String comment, double rating) {
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
    }
}
