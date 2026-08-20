package com.example.backend_admin.modules.users.application.ports.input;

import com.example.backend_admin.modules.users.application.dto.input.CreateUserCommand;
import com.example.backend_admin.modules.users.application.dto.output.UserOutput;

public interface CreateUserInputPort {
    UserOutput execute(CreateUserCommand command);
}
