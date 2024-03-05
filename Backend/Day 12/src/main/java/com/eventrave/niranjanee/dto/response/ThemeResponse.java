package com.eventrave.niranjanee.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThemeResponse {
    private String themeName;
    private String themeDesc;
    private float themePrice;
    private String message;
}
