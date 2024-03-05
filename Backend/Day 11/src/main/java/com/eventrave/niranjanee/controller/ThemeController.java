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

import com.eventrave.niranjanee.dto.request.ThemeRequest;
import com.eventrave.niranjanee.dto.response.ThemeResponse;
import com.eventrave.niranjanee.service.ThemeService;
import com.eventrave.niranjanee.utils.MyConstant;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping(MyConstant.AUTH)
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeService themeService;

    @PostMapping("/addtheme")
    public ResponseEntity<ThemeResponse> addtheme(@RequestBody ThemeRequest request) {
        ThemeResponse response = new ThemeResponse();
        try{
            response = themeService.addtheme(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        }
        catch(Exception e){
            response.setMessage("Theme could not be added");
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/gettheme/{themeName}")
    public ResponseEntity<ThemeResponse> getthemeinfo(@PathVariable String themeName) {
        ThemeResponse response = new ThemeResponse();
        try {
            response = themeService.getthemeinfo(themeName);
            if (response == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setMessage("Failed to fetch theme information");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deletetheme/{themeName}")
    public ResponseEntity<ThemeResponse> deletetheme(@PathVariable String themeName) {
        ThemeResponse response = new ThemeResponse();
        try {
        response = themeService.deletetheme(themeName);
        if (response.getMessage() != null) {
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
        }   catch (Exception e) {
        response.setMessage("Failed to delete theme");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/edittheme/{themeName}")
    public ResponseEntity<ThemeResponse> editTheme(@PathVariable String themeName, @RequestBody ThemeRequest request) {
        ThemeResponse response = new ThemeResponse();
        try {
        response = themeService.editTheme(themeName, request);
        if (response == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
        response.setMessage("Failed to edit theme");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
