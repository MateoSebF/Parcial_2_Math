package com.parcial.arep_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parcial.arep_2.model.MathOperation;
import com.parcial.arep_2.service.MathService;

@RestController
public class MathController {
    @Autowired
    public MathService mathService;

    @GetMapping("/linearSearch")
    public MathOperation linearSearch(@RequestParam String list, @RequestParam int value){
        return mathService.makeOperation("linearSearch", list, value);
    }

    @GetMapping("/binarySearch")
    public MathOperation binarySearch(@RequestParam String list, @RequestParam int value){
        return mathService.makeOperation("binarySearch", list, value);
    }
}
