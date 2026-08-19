package main.java.com.example.backend_admin.modules.users.domain.errors;

public class InvalidFormatRoleException extends RuntimeException {
    public InvalidFormatRoleException(String value) {
        super("The provided value '" + value + "' must be a valid role.");
    }
}
