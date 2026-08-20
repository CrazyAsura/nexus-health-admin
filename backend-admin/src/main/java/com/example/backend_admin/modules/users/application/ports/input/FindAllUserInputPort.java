package com.example.backend_admin.modules.users.application.ports.input;

import java.util.List;

import com.example.backend_admin.modules.users.application.dto.output.UserOutput;

public interface FindAllUserInputPort {
    List<UserOutput> execute();
}