package com.example.backend_admin.modules.users.application.ports.input;

import com.example.backend_admin.modules.users.application.dto.input.UpdateUserCommand;
import com.example.backend_admin.modules.users.application.dto.output.UserOutput;
import com.example.backend_admin.modules.users.domain.valueobjects.Id;

public interface UpdateUserInputPort {
    UserOutput execute(Id id, UpdateUserCommand command);
}
