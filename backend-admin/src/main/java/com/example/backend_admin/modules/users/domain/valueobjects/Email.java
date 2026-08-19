package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import java.util.regex.Pattern;

import com.example.backend_admin.modules.users.domain.errors.InvalidFormatEmailException;

public record Email(String value) {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    public Email {
        if (value == null || value.trim().isEmpty()) {
            throw new InvalidFormatEmailException(value);
        }
        if (!EMAIL_PATTERN.matcher(value).matches()) {
            throw new InvalidFormatEmailException(value);
        }
    }
}
