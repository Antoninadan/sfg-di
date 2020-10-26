package ua.i.mail100.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import ua.i.mail100.sfgdi.services.GreetingService;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello");
        return "Hi folks";
    }
}
