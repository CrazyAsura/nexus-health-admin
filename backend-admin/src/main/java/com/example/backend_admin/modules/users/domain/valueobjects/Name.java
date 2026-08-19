package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import com.example.backend_admin.modules.users.domain.errors.InvalidFormatNameException;

public record Name(String value) {
    public Name {
        if (value == null || value.trim().isEmpty()) {
            throw new InvalidFormatNameException(value);
        }
        if (value.length() > 255) {
            throw new InvalidFormatNameException(value);
        }
    }
}
