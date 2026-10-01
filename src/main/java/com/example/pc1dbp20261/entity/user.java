package com.example.pc1dbp20261.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor

public class user {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    @Column (unique = true)
    private String email;
    private String password;

    @Enumerated (EnumType.STRING)
    private Role role;


}
