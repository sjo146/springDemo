package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class welcomeControll {
@RequestMapping("/welcome")
    public String welcome(){
    return "index";
}
}
