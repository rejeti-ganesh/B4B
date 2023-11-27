package com.B4B.ganesh.b4b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("login")
public class LandingController {
	
	@GetMapping("/getUser")
    public String viewBooks(Model model) {
        model.addAttribute("books", "books");
        return "Login";
    }
	
	
}
