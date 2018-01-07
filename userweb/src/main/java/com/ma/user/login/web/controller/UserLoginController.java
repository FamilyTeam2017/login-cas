package com.ma.user.login.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/login")
public class UserLoginController {

    @GetMapping("/view")
    public String loginView(){
        return "login";
    }
}
