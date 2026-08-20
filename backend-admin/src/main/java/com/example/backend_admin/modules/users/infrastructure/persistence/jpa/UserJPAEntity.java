package com.example.backend_admin.modules.users.infrastructure.persistence.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import com.example.backend_admin.modules.users.domain.enums.EnumRole;
import com.example.backend_admin.modules.users.domain.enums.EnumStatus;
import com.example.backend_admin.modules.users.domain.valueobjects.CreatedAt;
import com.example.backend_admin.modules.users.domain.valueobjects.Email;
import com.example.backend_admin.modules.users.domain.valueobjects.Id;
import com.example.backend_admin.modules.users.domain.valueobjects.Name;
import com.example.backend_admin.modules.users.domain.valueobjects.Password;
import com.example.backend_admin.modules.users.domain.valueobjects.UpdatedAt;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "user")
public class UserJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Id id;
    @Column(name = "name")
    private Name name;
    @Column(name = "email")
    private Email email;
    @Column(name = "password")
    private Password password;
    @Column(name = "role")
    private EnumRole role;
    @Column(name = "status")
    private EnumStatus status;
    @Column(name = "created_at")
    private CreatedAt createdAt;
    @Column(name = "updated_at")
    private UpdatedAt updatedAt;
}
