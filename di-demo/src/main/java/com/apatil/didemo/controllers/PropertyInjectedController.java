package com.apatil.didemo.controllers;

import com.apatil.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller  //Declares this controller as a component which will be managed by the Spring context
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingServiceImpl;  //Using core classes for DI. @Autowired lets Spring context know to inject the dependency here.

    public String sayHello(){
        return "PropertyInjectedController: " + greetingServiceImpl.sayGreeting();
    }

}
