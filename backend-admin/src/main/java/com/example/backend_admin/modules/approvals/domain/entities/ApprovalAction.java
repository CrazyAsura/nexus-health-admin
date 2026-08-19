package com.example.backend_admin.modules.approvals.domain.entities;

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
public class ApprovalAction implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
