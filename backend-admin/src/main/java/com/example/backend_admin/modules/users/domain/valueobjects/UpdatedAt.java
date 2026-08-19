package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import java.time.LocalDateTime;

import com.example.backend_admin.modules.users.domain.errors.InvalidFormatUpdatedAtException;

public record UpdatedAt(LocalDateTime value) {
    public UpdatedAt {
        if (value == null) {
            throw new InvalidFormatUpdatedAtException("UpdatedAt cannot be null");
        }

        if (value.isAfter(LocalDateTime.now())) {
            throw new InvalidFormatUpdatedAtException("UpdatedAt cannot be in the future");
        }

        if (value.isBefore(LocalDateTime.now().minusYears(100))) {
            throw new InvalidFormatUpdatedAtException("UpdatedAt cannot be in the past");
        }
    }
}
