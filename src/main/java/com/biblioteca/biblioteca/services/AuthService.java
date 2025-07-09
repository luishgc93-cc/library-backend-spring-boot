package com.biblioteca.biblioteca.services;

import com.biblioteca.biblioteca.jwt.AuthResponse;
import com.biblioteca.biblioteca.jwt.LoginRequest;
import com.biblioteca.biblioteca.jwt.RegisterRequest;
import com.biblioteca.biblioteca.repository.UserRepository;
import com.biblioteca.biblioteca.user.Role;
import com.biblioteca.biblioteca.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository repository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse login(LoginRequest request){
        return null;
    }

    public AuthResponse register(RegisterRequest request){
        User user = User
                .builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .role(Role.USER)
                .build();

        repository.save(user);
        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
