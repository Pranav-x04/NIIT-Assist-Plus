package com.birthdayevent.niranjanee.service.impl;

import com.birthdayevent.niranjanee.dto.request.ForgotPasswordRequest;
import com.birthdayevent.niranjanee.dto.request.LoginRequest;
import com.birthdayevent.niranjanee.dto.request.RegisterRequest;
import com.birthdayevent.niranjanee.dto.response.ForgotPasswordResponse;
import com.birthdayevent.niranjanee.dto.response.LoginResponse;
import com.birthdayevent.niranjanee.dto.response.RegisterResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response);
}
