package com.example.demomd4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class GreetingController {
    @GetMapping("/greeting")
     public String greeting(){
        return "view";
    }
}
