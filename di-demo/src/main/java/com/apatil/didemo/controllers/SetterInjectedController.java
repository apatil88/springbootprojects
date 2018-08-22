package com.apatil.didemo.controllers;

import com.apatil.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;  //Using Interfaces for DI

    public String sayHello(){
        return "SetterInjectedController: " + greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
