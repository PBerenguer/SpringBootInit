package com.pberenguer.springboot.services;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
    public String retrieveWelcomeMessage() {
	return "Bem vindo!!!!";
    }
}
