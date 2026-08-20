package com.example.backend_admin.modules.users.application.ports.input;

import java.util.Optional;

import com.example.backend_admin.modules.users.application.dto.output.UserOutput;
import com.example.backend_admin.modules.users.domain.valueobjects.Email;

public interface FindByEmailInputPort {
    Optional<UserOutput> execute(Email email);
}
