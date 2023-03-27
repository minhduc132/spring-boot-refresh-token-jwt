package com.fpt.edu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {
    @GetMapping("home")
    public String home(Model model) {
        return "index";
    }
    @GetMapping("reservation")
    public String reservation(Model model) {
        return "reservation";
    }
    @GetMapping("menu")
    public String menu(Model model) {
        return "menu";
    }
    @GetMapping("gallery")
    public String gallery(Model model) {
        return "gallery";
    }@GetMapping("about")
    public String about(Model model) {
        return "about";
    }
    @GetMapping("blog")
    public String blog(Model model) {
        return "blog";
    }
    @GetMapping("contact")
    public String contact(Model model) {
        return "contact";
    }
}
