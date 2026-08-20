package com.example.backend_admin.modules.users.application.mappers;

import com.example.backend_admin.modules.users.infrastructure.persistence.jpa.UserJPAEntity;

import co.elastic.clients.elasticsearch.security.User;
import co.elastic.clients.elasticsearch.security.User.Builder;
public final class UserPersistenceMapper {
    public static UserJPAEntity toEntity(User user) {
        return UserJPAEntity
                    .builder()
                    .id(user.getId())
                    .name(user.getName())
                    .email(user.getEmail())
                    .password(user.getPassword())
                    .role(user.getRole())
                    .status(user.getStatus())
                    .createdAt(user.getCreatedAt())
                    .updatedAt(user.getUpdatedAt())
                    .build();
    }

    public static UserOutput toUserOutput(UserJPAEntity user) {
        return UserOutput
                    .builder()
                    .id(user.getId())
                    .name(user.getName())
                    .email(user.getEmail())
                    .role(user.getRole())
                    .status(user.getStatus())
                    .createdAt(user.getCreatedAt())
                    .updatedAt(user.getUpdatedAt())
                    .build();
    }
}
