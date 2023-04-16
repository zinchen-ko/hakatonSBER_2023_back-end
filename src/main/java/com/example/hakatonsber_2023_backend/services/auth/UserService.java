package com.example.hakatonsber_2023_backend.services.auth;

import com.example.hakatonsber_2023_backend.dto.request.AuthRequest;
import com.example.hakatonsber_2023_backend.dto.response.JwtResponse;
import com.example.hakatonsber_2023_backend.dto.response.MessageResponse;
import com.example.hakatonsber_2023_backend.entity.User;
import com.example.hakatonsber_2023_backend.repositories.UserRepository;
import com.example.hakatonsber_2023_backend.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    private UserRepository userRepository;

    public MessageResponse register(AuthRequest authRequest) {

        if(userRepository.existsByUsername(authRequest.getUsername())) {
            return new MessageResponse("Auth Error, User already exist", 405);
        } else {
            User user = new User(authRequest.getUsername(),
                    passwordEncoder.encode(authRequest.getPassword()));
            userRepository.save(user);
            return new MessageResponse("Okay", 200);
        }
    }

    public JwtResponse login(AuthRequest authRequest) {
        if (userRepository.existsByUsername(authRequest.getUsername())) {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(
                            authRequest.getUsername(),
                            authRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            return new JwtResponse(jwt,
                    userDetails.getId(),
                    userDetails.getUsername());
        } else {
            return new JwtResponse("ERROR",
                    1L,
                    "ERROR");
        }
    }
}
