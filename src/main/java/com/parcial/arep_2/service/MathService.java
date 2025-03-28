package com.parcial.arep_2.service;

import org.springframework.stereotype.Controller;

import com.parcial.arep_2.model.MathOperation;

@Controller
public class MathService {

    public MathOperation makeOperation(String operation, String list, int value){
        MathOperation mathOperation = new MathOperation(operation, list, value, -1);
        return mathOperation;
    }
    
}
