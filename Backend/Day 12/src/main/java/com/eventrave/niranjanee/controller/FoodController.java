package com.eventrave.niranjanee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventrave.niranjanee.dto.request.FoodRequest;
import com.eventrave.niranjanee.dto.response.FoodResponse;
import com.eventrave.niranjanee.service.FoodService;
import com.eventrave.niranjanee.utils.MyConstant;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(MyConstant.AUTH)
@RequiredArgsConstructor
public class FoodController {
    private final FoodService  foodService;

    @PostMapping("/addfood")
    public ResponseEntity<FoodResponse> addfood(@RequestBody FoodRequest request) {
        FoodResponse response = new FoodResponse();
        try{
            response = foodService.addfood(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        }
        catch(Exception e){
            response.setMessage("Food could not be added");
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/getfood/{foodName}")
    public ResponseEntity<FoodResponse> getfoodinfo(@PathVariable String FoodName) {
        FoodResponse response = new FoodResponse();
        try {
            response = foodService.getfoodinfo(FoodName);
            if (response == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Failed to fetch Food information");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deletefood/{foodName}")
    public ResponseEntity<FoodResponse> deletefood(@PathVariable String FoodName) {
        FoodResponse response = new FoodResponse();
        try {
        response = foodService.deletefood(FoodName);
        if (response.getMessage() != null) {
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
        }   catch (Exception e) {
        response.setMessage("Failed to delete Food");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/editFood/{foodName}")
    public ResponseEntity<FoodResponse> editfood(@PathVariable String FoodName, @RequestBody FoodRequest request) {
        FoodResponse response = new FoodResponse();
        try {
        response = foodService.editfood(FoodName, request);
        if (response == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
        response.setMessage("Failed to edit Food");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
