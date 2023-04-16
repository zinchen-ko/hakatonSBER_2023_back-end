package com.example.hakatonsber_2023_backend.services.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.entities.UserEntity;
import project.pojo.request.AuthRequest;
import project.pojo.response.JwtResponse;
import project.pojo.response.MessageResponse;
import project.repositories.UserRepository;
import project.security.jwt.JwtUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    public UserEntity getUserByUsername(String username){
        return userRepository.findByUsername(username).get();
    }

    public MessageResponse register(AuthRequest authRequest) {

        if(userRepository.existsByUsername(authRequest.getUsername())) {
            return new MessageResponse("Error");
        } else {
            UserEntity user = new UserEntity(authRequest.getUsername(),
                    passwordEncoder.encode(authRequest.getPassword()));
            userRepository.save(user);
            return new MessageResponse("Okay");
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
