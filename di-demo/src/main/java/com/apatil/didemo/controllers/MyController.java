package com.apatil.didemo.controllers;

import com.apatil.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("MyController : Hello!");
        return greetingService.sayGreeting();
    }
}
