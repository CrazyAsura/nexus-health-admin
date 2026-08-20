package com.example.backend_admin.modules.users.application.ports.input;

import java.util.List;

import com.example.backend_admin.modules.users.application.dto.output.UserOutput;
import com.example.backend_admin.modules.users.domain.valueobjects.Name;

public interface FindByNameInputPort {
    List<UserOutput> execute(Name name);
}
