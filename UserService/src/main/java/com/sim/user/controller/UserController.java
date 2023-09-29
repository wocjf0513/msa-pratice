package com.sim.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")

public class UserController {

    @GetMapping("/info")
    public String info(){
        return "User Service";
    }
}
