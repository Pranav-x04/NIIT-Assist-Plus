package com.birthdayevent.niranjanee.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class RegisterResponse {
    @Builder.Default
    private String message="Something went wrong.";

}
