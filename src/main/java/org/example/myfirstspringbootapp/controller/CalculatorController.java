package org.example.myfirstspringbootapp.controller;

import org.example.myfirstspringbootapp.dto.Result;
import org.example.myfirstspringbootapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    //@Autowired
    //private CalculatorService calculatorService; // field level injection

    // constructor level injection
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping("/calculate/{a}/{b}")
    public Result calculate( @PathVariable int a, @PathVariable int b) {
        int result = calculatorService.add(a,b);
        Result response = new Result();
        response.setResult(result);
        response.setMessage("result of "+a+" and "+b+" is "+result);
        return response;
    }
}