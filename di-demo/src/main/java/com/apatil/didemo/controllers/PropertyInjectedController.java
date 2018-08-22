package com.apatil.didemo.controllers;

import com.apatil.didemo.services.GreetingService;
import com.apatil.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller  //Declares this controller as a component which will be managed by the Spring context
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingServiceImpl;  //Using core classes for DI. @Autowired lets Spring context know to inject the dependency here.

    //@Autowired
    //public GreetingService greetingServiceImpl;  //Note: type is the Interface, but the name is the core class Bean name. However, avoid using this shortcut.

    public String sayHello(){
        return "PropertyInjectedController: " + greetingServiceImpl.sayGreeting();
    }

}
