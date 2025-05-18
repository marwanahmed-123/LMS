package com.lms.service;

import com.lms.persistence.Course;
import com.lms.persistence.Lesson;
import com.lms.persistence.Review;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    void uploadMedia(String courseId, MultipartFile file);
    List<String> getMediaForCourse(String courseId);
    void addLessonToCourse(String courseId, Lesson lesson);
    List<Lesson> getLessonsForCourse(String courseId);
    Course findCourseById(String courseId);
    void addReview(String courseId, Review review);
    List<Review> getReviews(String courseId);
    double getAverageRating(String courseId);
    public List<Course> getAllCourses();
}