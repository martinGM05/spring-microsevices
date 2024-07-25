package com.msvc.hotel.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/staffs")
public class StaffController {

    @GetMapping
    public ResponseEntity<List<String>> listarStaffs(){
        List<String> staffs = Arrays.asList("Cristian, Juan, Pedro, Maria");
        return new ResponseEntity<>(staffs,  HttpStatus.OK);
    }
    
}
