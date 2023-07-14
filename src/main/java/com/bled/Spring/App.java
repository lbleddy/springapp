package com.bled.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        //BeanFactory beanFactory = new XMLBeanFactory(new ClassPathResource("spring.xml"));
        //BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        //Car obj =(Car) context.getBean("car");
        //obj.drive();
        Car c = factory.getBean(Car.class);
        c.drive();
        //Tyre t = (Tyre) context.getBean("tyre");
        //System.out.println(t);
    }
}
