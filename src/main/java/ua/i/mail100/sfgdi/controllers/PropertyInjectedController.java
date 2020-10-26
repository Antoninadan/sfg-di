package ua.i.mail100.sfgdi.controllers;

import ua.i.mail100.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public  String getGreeting(){
        return greetingService.sayGreeting();
    }
}
