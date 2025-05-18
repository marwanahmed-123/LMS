package com.lms.service.impl;

import com.lms.persistence.UserDashboard;
import com.lms.persistence.Course;
import com.lms.persistence.repositories.RepositoryFacade;
import com.lms.service.DashboardService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {
    private final RepositoryFacade repository;

    @Override
    public UserDashboard getUserDashboard(String userId) {
        UserDashboard dashboard = new UserDashboard();
        dashboard.setUserId(userId);
        List<Course> courses = repository.getAllRegisteredCourses(userId);
        dashboard.setEnrolledCoursesCount(courses.size());
        List<Course> courseSummaries = courses.stream()
            .map(course -> new Course(
                course.getId(),
                course.getTitle(),
                course.getDescription(),
                course.getDuration(),
                course.getProfid()
            ))
            .collect(Collectors.toList());
        dashboard.setEnrolledCourses(courseSummaries);
        return dashboard;
    }
}