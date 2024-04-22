package com.example.baitap2tudien.controller;

import com.example.baitap2tudien.model.TuDien;
import com.example.baitap2tudien.service.ITuDienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/TuDien")
public class TuDienController {
    @Autowired
    public ITuDienService ituDienService;

    @GetMapping("")
    public String showTuDien() {
        return "view";
    }

    @PostMapping("/result")
    public String TuDien(@RequestParam(name = "keyword") String keyword, Model model) {
        List<TuDien> list = ituDienService.findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTiengAnh().equalsIgnoreCase(keyword)) {
                model.addAttribute("word", list.get(i).getTiengViet());
                model.addAttribute("keyword", keyword);
            }
        }
            return "view";

}
}
