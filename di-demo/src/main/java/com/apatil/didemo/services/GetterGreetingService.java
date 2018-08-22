package com.apatil.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "GetterGreetingService - I was injected by the Getter";
    }
}
