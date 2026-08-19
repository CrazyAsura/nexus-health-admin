package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatEmailException extends RuntimeException {
    public InvalidFormatEmailException(String value) {
        super("The provided value '" + value + "' must be a valid email address.");
    }
}
