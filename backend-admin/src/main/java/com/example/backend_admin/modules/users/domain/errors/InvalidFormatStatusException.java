package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatStatusException extends RuntimeException {
    public InvalidFormatStatusException(String value) {
        super("The provided value '" + value + "' must be a valid status.");
    }
}
