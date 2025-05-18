package com.lms.persistence;

import lombok.Data;

@Data
public class Lesson {
    private String  id;
    //private Long CourseId;
    private String title;
    private String content;  // URL or textual content

    public Lesson(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;

    }

}
