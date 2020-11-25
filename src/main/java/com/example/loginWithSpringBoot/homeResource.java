package com.example.loginWithSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeResource {
    @GetMapping("/")
    public String welcome(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
