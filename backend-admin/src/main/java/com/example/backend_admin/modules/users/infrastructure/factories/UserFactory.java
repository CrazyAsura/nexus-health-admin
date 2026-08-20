package com.example.backend_admin.modules.users.infrastructure.factories;

import co.elastic.clients.elasticsearch.security.User;

public final class UserFactory {
    public static User createUser(String name, String email, String password, String role) {
        return User
                .builder()
                .id(null)
                .name(name)
                .email(email)
                .password(password)
                .role(role)
                .createdAt(null)
                .updatedAt(null)
                .build();
    }
}
