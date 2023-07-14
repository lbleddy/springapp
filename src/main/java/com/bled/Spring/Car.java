package com.bled.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Autowired
    @Qualifier("snapDragon")
    private CarProcessor processor;

    public CarProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(CarProcessor processor) {
        this.processor = processor;
    }

    @Autowired
    private Tyre tyre;

    public void drive(){
        System.out.println("car"+tyre);
        processor.process();
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
