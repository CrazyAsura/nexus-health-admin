package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatHashedPasswordException extends RuntimeException {
    public InvalidFormatHashedPasswordException(String value) {
        super("The provided value '" + value + "' must be a valid SHA-256 hash.");
    }
}
