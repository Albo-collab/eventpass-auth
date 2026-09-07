package com.eventpass.auth.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(String email, String password) {
        // Aquí iría la lógica de autenticación
        return "token-jwt-ejemplo";
    }

    public String register(String nombre, String email, String password, String rol) {
        // Aquí iría la lógica de registro
        return "Usuario registrado correctamente";
    }
}
