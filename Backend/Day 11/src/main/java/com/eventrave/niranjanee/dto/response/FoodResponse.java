package com.eventrave.niranjanee.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodResponse {
    private String foodName;
    private String foodDesc;
    private float foodPrice;
    private String message;

}
