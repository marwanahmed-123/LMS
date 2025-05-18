package com.lms.service;

import com.lms.persistence.UserDashboard;

public interface DashboardService {
    public UserDashboard getUserDashboard(String userId);
}
