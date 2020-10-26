package ua.i.mail100.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - constructor";
    }
}
