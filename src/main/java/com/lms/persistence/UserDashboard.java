package com.lms.persistence;

import lombok.Data;

import java.util.List;
@Data
public class UserDashboard {
    private String userId;
    private String name;
    private int enrolledCoursesCount;
    private List<Course> enrolledCourses;
}
