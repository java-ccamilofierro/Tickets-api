package com.doublevpartners.ticket_api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "need to add a user to the ticket")
	@NotBlank(message = "need to add a user to the ticket")
    private String username;

    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    @NotNull(message = "need to add a ticket status")
	@NotBlank(message = "need to add a ticket status")
    @Pattern(regexp = "^(Abierto|Cerrado)$", message = "status must be either 'Abierto' or 'Cerrado'")
    private String status;

    @PrePersist
    protected void onCreate() {
        this.creationDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateDate = LocalDateTime.now();
    }
}
