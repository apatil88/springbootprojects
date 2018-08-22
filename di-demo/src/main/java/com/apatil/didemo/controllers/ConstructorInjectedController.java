package com.apatil.didemo.controllers;

import com.apatil.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired  //Spring 4.2 onwards does not require use of @Autowired for Constructor based DI. However, it is a good practice.
    ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return "ConstructorInjectedController: " + greetingService.sayGreeting();
    }


}
