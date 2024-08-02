package com.auth.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "<h1>Home</h1>";
    }
    @GetMapping("/user")
    public String user(){
        return "<h1>Users</h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>Admins</h1>";
    }

}
