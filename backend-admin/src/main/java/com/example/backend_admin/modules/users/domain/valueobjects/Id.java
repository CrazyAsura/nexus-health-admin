package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import java.util.UUID;

import com.example.backend_admin.modules.users.domain.errors.InvalidFormatIdException;

public record Id(UUID value) {
    public Id {
        if (value == null) {
            throw new InvalidFormatIdException("Id cannot be null");
        }
    }

    public static Id random() {
        return new Id(UUID.randomUUID());
    }

    public static Id fromString(String id) {
        return new Id(UUID.fromString(id));
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
