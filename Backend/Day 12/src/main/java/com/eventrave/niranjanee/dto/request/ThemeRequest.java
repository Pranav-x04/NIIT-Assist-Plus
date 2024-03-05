package com.eventrave.niranjanee.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThemeRequest {
    private String themeName;
    private String themeDesc;
    private float themePrice;

}
