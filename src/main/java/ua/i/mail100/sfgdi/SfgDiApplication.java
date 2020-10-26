package ua.i.mail100.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ua.i.mail100.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);


        System.out.println("___________________Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("___________________Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());


        System.out.println("___________________Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("___________________Primary");
        PrimaryInjectedController primaryInjectedController =
                (PrimaryInjectedController) context.getBean("primaryInjectedController");
        greeting = primaryInjectedController.sayHello();
        System.out.println(greeting);

        System.out.println("___________________Profile EN / ES");
        I18nController i18nController =
                (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

    }

}
