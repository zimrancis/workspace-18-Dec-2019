package com.ciphersnippet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/jsp") //http://localhost:8080/jsp?name=Zobair
    String jspPage(Model model,@RequestParam String name) {
        model.addAttribute("name", name);
        return "jsp/sample";
    }

    @GetMapping("/thymeleaf") //http://localhost:8080/thymeleaf?name=Zobair
    String thymeleafPage(Model model,@RequestParam String name) {
        model.addAttribute("name", name);
        return "thymeleaf/sample";
    }
}