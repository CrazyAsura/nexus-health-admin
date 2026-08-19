package main.java.com.example.backend_admin.modules.users.application.ports.output;

import java.util.UUID;
import java.util.List;
import java.util.Optional;

import com.example.backend_admin.modules.users.application.dto.input.CreateUserCommand;
import com.example.backend_admin.modules.users.application.dto.input.UpdateUserCommand;
import com.example.backend_admin.modules.users.application.dto.output.UserOutput;

import main.java.com.example.backend_admin.modules.users.domain.valueobjects.Id;
import main.java.com.example.backend_admin.modules.users.domain.valueobjects.Email;
import main.java.com.example.backend_admin.modules.users.domain.valueobjects.Name;

public interface UserPersistencePort {
    List<UserOutput> findAll();
    Optional<UserOutput> findById(Id id);
    List<UserOutput> findByName(Name name);
    Optional<UserOutput> findByEmail(Email email);
    UserOutput create(CreateUserCommand command);
    UserOutput update(Id id, UpdateUserCommand command);
    UserOutput delete(Id id);
}
