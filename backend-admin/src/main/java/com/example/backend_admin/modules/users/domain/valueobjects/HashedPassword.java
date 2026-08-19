package main.java.com.example.backend_admin.modules.users.domain.valueobjects;

import java.util.regex.Pattern;

import com.example.backend_admin.modules.users.domain.errors.InvalidFormatHashedPasswordException;

public record HashedPassword(String value) {
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{14,}$");

    public HashedPassword {
        if (value == null || value.trim().isEmpty()) {
            throw new InvalidFormatHashedPasswordException(value);
        }
        if (value.length() < 14) {
            throw new InvalidFormatHashedPasswordException(value);
        }
        if (!PASSWORD_PATTERN.matcher(value).matches()) {
            throw new InvalidFormatHashedPasswordException(value);
        }
    }
}
