package ua.i.mail100.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import ua.i.mail100.sfgdi.services.GreetingService;

@Controller
public class PrimaryInjectedController {
    private final GreetingService greetingService;

    public PrimaryInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
