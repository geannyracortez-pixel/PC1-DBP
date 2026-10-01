package com.example.pc1dbp20261.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest (@NotBlank String username, @NotBlank String password) {
}
