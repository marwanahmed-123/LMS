package com.lms.persistence;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Course {
    // Getters and Setters
    private String id;
    private String profId;

    private String title;
    private String description;
    private int duration;  // Duration in days or hours
    private List<Lesson> lessons = new ArrayList<>();  // List of lessons
    private List<String> mediaPaths = new ArrayList<>();  // List of media file paths or URLs
    private List<Review> reviews = new ArrayList<>();
    private double averageRating;

    // Constructor, Getters, Setters
    public Course(String id, String title, String description, int duration,String profid) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.profId = profid;
    }
    public void addReview(Review review) {
        this.reviews.add(review);
        updateAverageRating();
    }
    private void updateAverageRating() {
        if (reviews.isEmpty()) {
            this.averageRating = 0;
            return;
        }
        double total = 0;
        for (Review review : reviews) {
            total += review.getRating();
        }
        this.averageRating = total / reviews.size();
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public void addMedia(String mediaPath) {
        this.mediaPaths.add(mediaPath);
    }

}