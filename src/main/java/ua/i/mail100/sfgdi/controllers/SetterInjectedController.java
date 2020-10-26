package ua.i.mail100.sfgdi.controllers;

import ua.i.mail100.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String getGreeting(){
        return greetingService.sayGreeting();
    }

}
