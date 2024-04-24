package com.example.baitap1sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/GiaVi")
public class SandWichController {
    @GetMapping("")
    public String homePage(){
        return "view";
    }
    @PostMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "save";
    }
}
