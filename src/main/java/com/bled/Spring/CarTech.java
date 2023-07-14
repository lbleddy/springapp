package com.bled.Spring;

import org.springframework.stereotype.Component;

@Component
public class CarTech implements CarProcessor{

    public void process(){
        System.out.println("2nd best");
    }
}
