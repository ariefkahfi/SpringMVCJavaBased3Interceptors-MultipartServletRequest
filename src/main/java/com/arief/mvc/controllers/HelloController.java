package com.arief.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @RequestMapping("/hello-world")
    public String sayHelloWorld(){
        return "hello-world";
    }
}
