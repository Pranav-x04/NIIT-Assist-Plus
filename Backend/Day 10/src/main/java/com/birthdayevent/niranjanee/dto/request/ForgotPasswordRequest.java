package com.birthdayevent.niranjanee.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ForgotPasswordRequest {
    private String email;
    private String currentPassword;
    private String newPassword;
    private String confirmPassword;


}
