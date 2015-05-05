package com.antonioleiva.daggerexample.app.ui.vehicule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jquievreux on 05/05/15.
 */
@Module
public class VehicleModule {

    public VehicleModule(){}

    @Provides
    public Motor provideMotor(){
        return new Motor();
    }

    @Provides
    public Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}