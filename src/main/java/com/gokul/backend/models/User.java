package com.gokul.backend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity
public class User {
    @Id
    @SequenceGenerator(name="USER_GEN",sequenceName = "SEQ_USER",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USER_GEN")
    private Long userId;
    @NotBlank(message = "username is required")
    private String username;
    @NotBlank(message = "password is required")
    private String password;
    @Email
    @NotBlank(message = "email is required")
    private String email;
    private Instant creationDate;
    private boolean accountStatus;
}
