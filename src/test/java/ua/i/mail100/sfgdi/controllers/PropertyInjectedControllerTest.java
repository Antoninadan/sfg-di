package ua.i.mail100.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.i.mail100.sfgdi.services.PropertyInjectionGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyInjectionGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}