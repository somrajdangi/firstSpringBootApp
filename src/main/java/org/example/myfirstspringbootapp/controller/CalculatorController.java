package org.example.myfirstspringbootapp.controller;

import org.example.myfirstspringbootapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @GetMapping("/calculate/{a}/{b}")

   int calculate(
            @PathVariable int firstValue,
            @PathVariable int secondValue) {

        return calculatorService.add(firstValue,secondValue);
    }
}
