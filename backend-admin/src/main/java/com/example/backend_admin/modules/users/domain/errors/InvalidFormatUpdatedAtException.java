package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatUpdatedAtException extends RuntimeException {
    public InvalidFormatUpdatedAtException(String value) {
        super("The provided value '" + value + "' must be a valid date and time.");
    }
}