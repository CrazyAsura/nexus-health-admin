package com.example.backend_admin.modules.users.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Id id;
    private Name name;
    private Email email;
    private HashedPassword hashedPassword;
    private Status status;
    private Role role;
    private CreatedAt createdAt;
    private UpdatedAt updatedAt;
}
