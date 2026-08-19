package main.java.com.example.backend_admin.modules.users.domain.errors;

import java.time.LocalDateTime;

public class InvalidFormatCreatedAtException extends RuntimeException {
    public InvalidFormatCreatedAtException(LocalDateTime value) {
        super("The provided value '" + value + "' must be a valid date and time, and cannot be in the future or before 100 years ago.");
    }
}
