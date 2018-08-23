package com.apatil.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary  //When there are multiple beans, inject this bean
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "PrimaryGreetingService - Hello";
    }
}
