package main.java.com.example.backend_admin.modules.users.application.dto.output;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserOutput(
        UUID id,
        String name,
        String email,
        String role,
        String status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
}
