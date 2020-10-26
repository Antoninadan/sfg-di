package ua.i.mail100.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ua.i.mail100.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectionGreetingService")
    @Autowired
    public GreetingService greetingService;

    public  String getGreeting(){
        return greetingService.sayGreeting();
    }
}
