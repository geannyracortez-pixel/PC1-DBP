package com.example.pc1dbp20261.dto;

public record RegisterRequest(
        @NotBlank String username
        @NotBlank @Email String email,
        @NotBlank @size(min = 8, message ="Al menos debe contar con 8 caracteres") String password

){
}
