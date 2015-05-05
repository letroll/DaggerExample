package com.antonioleiva.daggerexample.app.ui.vehicule;

/**
 * Created by jquievreux on 05/05/15.
 */
public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}