package com.birthdayevent.niranjanee.controller;
import static com.birthdayevent.niranjanee.utils.MyConstant.AUTH;
import static com.birthdayevent.niranjanee.utils.MyConstant.FORGOT_PASSWORD;
import static com.birthdayevent.niranjanee.utils.MyConstant.LOGIN;
import static com.birthdayevent.niranjanee.utils.MyConstant.REFRESR_TOKEN;
import static com.birthdayevent.niranjanee.utils.MyConstant.REGISTER;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthdayevent.niranjanee.dto.request.ForgotPasswordRequest;
import com.birthdayevent.niranjanee.dto.request.LoginRequest;
import com.birthdayevent.niranjanee.dto.request.RegisterRequest;
import com.birthdayevent.niranjanee.dto.response.ForgotPasswordResponse;
import com.birthdayevent.niranjanee.dto.response.LoginResponse;
import com.birthdayevent.niranjanee.dto.response.RegisterResponse;
import com.birthdayevent.niranjanee.service.impl.AuthenticationService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH)
public class AuthenticationController {
    private final AuthenticationService authService;

    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        try {
            response = authService.register(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Registration failed due to an unexpected error.");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @PostMapping(LOGIN)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        LoginResponse response = new LoginResponse();
        try {
            response = authService.login(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Login failed!");
            response.setToken("");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @PostMapping(REFRESR_TOKEN)
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        authService.refreshToken(request, response);
    }

    @PatchMapping(FORGOT_PASSWORD)
    public ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequest request)
    {
        ForgotPasswordResponse response = new ForgotPasswordResponse();
        try{
            response = authService.forgotPassword(request);
            return new ResponseEntity<>(response,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}