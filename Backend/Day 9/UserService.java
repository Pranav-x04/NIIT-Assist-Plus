package com.birthdayevent.niranjanee.service.impl;

import com.birthdayevent.niranjanee.dto.request.RegisterRequest;
import com.birthdayevent.niranjanee.dto.response.RegisterResponse;

public interface UserService {
     RegisterResponse register(RegisterRequest request);

}
