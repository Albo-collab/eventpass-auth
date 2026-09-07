# EventPass - Microservicio de Autenticación y Usuarios

Microservicio encargado de la autenticación y gestión de usuarios de la plataforma EventPass.

## Funcionalidades
- Registro de usuarios
- Login (generación de token JWT)
- Autorización por roles (Comprador y Staff)

## Tecnologías
- Java + Spring Boot
- Spring Security
- JWT

## Endpoints principales
- POST /api/auth/register
- POST /api/auth/login
- GET /api/auth/validate
