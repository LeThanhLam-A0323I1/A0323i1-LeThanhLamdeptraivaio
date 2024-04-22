package com.example.baitap1converter;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/converter")
public class ConverterController {
    @GetMapping("")
    public String showConverter() {
        return "converter";
    }

    @PostMapping("/submit")
    public String converter(@RequestParam(name = "usd") String usd, @RequestParam(name = "rate") String rate, Model model) {
        float result = Float.parseFloat(usd) * Float.parseFloat(rate);
        model.addAttribute("result", result);
        return "result";
    }
}
