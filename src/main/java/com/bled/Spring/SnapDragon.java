package com.bled.Spring;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements CarProcessor{



    public void process(){
        System.out.println("Octa Core 4");
    }
}
