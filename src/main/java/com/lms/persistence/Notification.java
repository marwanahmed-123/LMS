package com.lms.persistence;

import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    private String id = UUID.randomUUID().toString().replaceAll("-", "").substring(0,6);
    private String userId;
    private String message;
    private boolean isRead = false;
    private LocalDateTime timestamp = LocalDateTime.now();
    public String getUserId() { return userId; }
    public boolean isRead() { return isRead; }
}
