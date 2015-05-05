package com.antonioleiva.daggerexample.app.ui.vehicule;

import com.antonioleiva.daggerexample.app.ActivityScope;
import com.antonioleiva.daggerexample.app.AppComponent;

import dagger.Component;

/**
 * Created by jquievreux on 05/05/15.
 */
@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = VehicleModule.class
)
public interface VehicleComponent {
    Vehicle getVehicle();
}