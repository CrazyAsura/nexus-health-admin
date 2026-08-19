package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import com.example.backend_admin.modules.users.domain.enums.EnumStatus;
import com.example.backend_admin.modules.users.domain.errors.InvalidFormatStatusException;

public record Status(EnumStatus value) {
    public Status {
        if (value == null) {
            throw new InvalidFormatStatusException("Status cannot be null");
        }
    }
}
