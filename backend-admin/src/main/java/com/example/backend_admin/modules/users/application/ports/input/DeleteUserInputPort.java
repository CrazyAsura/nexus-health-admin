package com.example.backend_admin.modules.users.application.ports.input;

import com.example.backend_admin.modules.users.application.dto.output.UserOutput;
import com.example.backend_admin.modules.users.domain.valueobjects.Id;

public interface DeleteUserInputPort {
    UserOutput execute(Id id);
}
