package main.java.com.example.backend_admin.modules.users.application.ports.input;

import main.java.com.example.backend_admin.modules.users.domain.valueobjects.HashedPassword;

public interface PasswordEncoderPort {
    HashedPassword hash(String rawPassword);
    boolean verify(HashedPassword rawPassword, HashedPassword hashedPassword);
}
