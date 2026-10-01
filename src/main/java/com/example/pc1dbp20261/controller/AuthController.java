package com.example.pc1dbp20261.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/auth")
@RequiredArgsConstructor


public class AuthController {
    public final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<tokenResponse> register (@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authService.register(request));

     @PostMapping("/login")
     public ResponseEntity <tokenResponse> login (@Valid @RequestBody LoginRequest request ) {
         return RespondeEntity.ok(authService.login(request));
        }
    }

}
