package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatNameException extends RuntimeException {
    public InvalidFormatNameException(String value) {
        super("The provided value '" + value + "' must be a valid name.");
    }
}
