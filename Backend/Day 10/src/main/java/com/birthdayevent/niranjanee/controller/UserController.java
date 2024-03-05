package com.birthdayevent.niranjanee.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayevent.niranjanee.dto.request.RegisterRequest;
import com.birthdayevent.niranjanee.dto.response.RegisterResponse;
import com.birthdayevent.niranjanee.service.impl.UserService;
import com.birthdayevent.niranjanee.utils.MyConstant;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(MyConstant.USER)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(MyConstant.REGISTER)
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        RegisterResponse response=new RegisterResponse();
        try{
            response = userService.register(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
