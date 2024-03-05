package com.birthdayevent.niranjanee.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.birthdayevent.niranjanee.dto.request.RegisterRequest;
import com.birthdayevent.niranjanee.dto.response.RegisterResponse;
import com.birthdayevent.niranjanee.model.User;
import com.birthdayevent.niranjanee.repository.UserRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
@SuppressWarnings("null")

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public RegisterResponse register(RegisterRequest request){
        Optional<User> isUser=userRepository.findByEmail(request.getEmail());
        if(isUser.isPresent()){
            return RegisterResponse.builder()
            .message("User already exists with email "+request.getEmail())
            .build();
        }
        var user = User.builder()
        .name(request.getName())
        .email(request.getEmail())
        .password(request.getPassword())
        .build();
        userRepository.save(user);
        return RegisterResponse.builder()
        .message("User registered successfully")
        .build();
}

}
