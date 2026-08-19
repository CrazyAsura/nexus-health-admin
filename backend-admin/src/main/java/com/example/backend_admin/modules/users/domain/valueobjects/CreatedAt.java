package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import java.time.LocalDateTime;

import com.example.backend_admin.modules.users.domain.errors.InvalidFormatCreatedAtException;

public record CreatedAt(LocalDateTime value) {
    public CreatedAt {
        if (value == null) {
            throw new InvalidFormatCreatedAtException(value);
        }
        if (value.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("CreatedAt cannot be in the future");
        }

        if (value.isBefore(LocalDateTime.now().minusYears(100))) {
            throw new IllegalArgumentException("CreatedAt cannot be in the past");
        }
    }
}
