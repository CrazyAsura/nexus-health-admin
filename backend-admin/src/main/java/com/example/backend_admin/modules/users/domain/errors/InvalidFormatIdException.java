package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatIdException extends RuntimeException {
    public InvalidFormatIdException(String value) {
        super("The provided value '" + value + "' must be a valid UUID.");
    }
}
