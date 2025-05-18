package com.lms.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpRequest {
    private String username;
    private String phoneNumber;
    private String lessonName;
    public String getUsername() { return username; }
    public String getLessonName() { return lessonName; }
    public String getPhoneNumber() { return phoneNumber; }
}
