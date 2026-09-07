package com.eventpass.auth.controller;

import com.eventpass.auth.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return authService.login(email, password);
    }

    @PostMapping("/register")
    public String register(@RequestParam String nombre,
                           @RequestParam String email,
                           @RequestParam String password,
                           @RequestParam String rol) {
        return authService.register(nombre, email, password, rol);
    }
}
