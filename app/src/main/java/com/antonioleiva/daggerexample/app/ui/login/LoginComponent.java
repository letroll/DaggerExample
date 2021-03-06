package com.antonioleiva.daggerexample.app.ui.login;

import com.antonioleiva.daggerexample.app.ActivityScope;
import com.antonioleiva.daggerexample.app.AppComponent;
import com.antonioleiva.daggerexample.app.ui.vehicule.VehicleModule;

import dagger.Component;

/**
 * Created by Miroslaw Stanek on 17.03.15.
 */
@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = {
                LoginModule.class,
                VehicleModule.class
        }
)
public interface LoginComponent {
    void inject(LoginActivity activity);

    LoginPresenter getLoginPresenter();
}