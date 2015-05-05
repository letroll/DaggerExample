package com.antonioleiva.daggerexample.app.ui.vehicule;

import javax.inject.Inject;

/**
 * Created by jquievreux on 05/05/15.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}