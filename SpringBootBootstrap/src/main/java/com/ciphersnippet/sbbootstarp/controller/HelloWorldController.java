package com.ciphersnippet.sbbootstarp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/")
    public String helloWorld(Model model) {
        return "index";
    }
    
    @RequestMapping("/my")
    public String myWorld(Model model) {
        return "my";
    }
 
}