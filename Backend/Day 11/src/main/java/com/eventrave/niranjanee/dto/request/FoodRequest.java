package com.eventrave.niranjanee.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodRequest {
    private String foodName;
    private String foodDesc;
    private float foodPrice;
}
