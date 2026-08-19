package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import com.example.backend_admin.modules.users.domain.enums.EnumRole;
import com.example.backend_admin.modules.users.domain.errors.InvalidFormatRoleException;

public record Role(EnumRole value) {
    public Role {
        if (value == null) {
            throw new InvalidFormatRoleException("Role cannot be null");
        }
    }
}
