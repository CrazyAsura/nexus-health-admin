package main.java.com.example.backend_admin.modules.users.application.dto.input;

import java.time.LocalDateTime;

public record UpdateUserCommand(
        String name,
        String email,
        String password,
        String role,
        String status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
}
