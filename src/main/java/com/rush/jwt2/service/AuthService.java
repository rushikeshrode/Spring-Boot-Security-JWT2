package com.rush.jwt2.service;

import com.rush.jwt2.dto.AuthResponse;
import com.rush.jwt2.dto.LoginRequest;
import com.rush.jwt2.dto.RegisterRequest;
import com.rush.jwt2.entity.User;
import com.rush.jwt2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String register(RegisterRequest registerRequest){

        boolean existByUsername = userRepo.existsByUsername(registerRequest.getUsername());
        if (existByUsername)
            return "Username: " + registerRequest.getUsername() + " is already taken.";

        User user = User.builder()
                .username(registerRequest.getUsername())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .confirmPassword(registerRequest.getConfirmPassword())
                .roles(registerRequest.getRole())
                .enable(true)
                .build();

        userRepo.save(user);
        return "User with username: " + registerRequest.getUsername() + " added successfully";
    }

    public AuthResponse login(LoginRequest loginRequest){

        String username = loginRequest.getUsername();
        User user = userRepo.findByUsername(username).orElseThrow(() -> new RuntimeException("User not Found."));

        if (passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())){
            String generateToken = jwtService.generateToken(username);
            return new AuthResponse("logged in @"+user.getUsername(), generateToken);
        }

        return new AuthResponse("🔂", "Invalid Username/Password");
    }

}
