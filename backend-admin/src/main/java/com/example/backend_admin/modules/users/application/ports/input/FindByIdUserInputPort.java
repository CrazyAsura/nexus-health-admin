package com.example.backend_admin.modules.users.application.ports.input;

import java.util.Optional;

import com.example.backend_admin.modules.users.application.dto.output.UserOutput;
import com.example.backend_admin.modules.users.domain.valueobjects.Id;

public interface FindByIdUserInputPort {
    Optional<UserOutput> execute(Id id);
}