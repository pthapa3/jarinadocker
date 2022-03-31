package com.springbootdockergradle.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greetings {


    @GetMapping("/demo")
    @ResponseBody
    public String greet() {
        return "Hello World";
    }

}
