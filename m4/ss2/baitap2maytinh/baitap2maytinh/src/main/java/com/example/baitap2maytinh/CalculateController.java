package com.example.baitap2maytinh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculate")
public class CalculateController {
    @GetMapping("")
    public String showCalculate() {
        return "calculate";
    }

    @PostMapping("/result")
    public String result(@RequestParam(name = "num1", defaultValue = "0") double num1, @RequestParam(name = "num2", defaultValue = "0") double num2,
                         @RequestParam(name = "calculation") String calculation, Model model) {
        double result = 0;
        switch (calculation) {
            case "Addition(+)":
                result = num1 + num2;
                calculation = "Addition";
                break;
            case "Subtraction(-)":
                result = num1 - num2;
                calculation = "Subtraction";
                break;
            case "Multiplication(*)":
                result = num1 * num2;
                calculation = "Multiplication";
                break;
            case "Division(/)":
                result = num1 / num2;
                calculation = "Division";
                break;
        }
        model.addAttribute("result", result);
        model.addAttribute("calculation", calculation);
        return "calculate";
    }
}