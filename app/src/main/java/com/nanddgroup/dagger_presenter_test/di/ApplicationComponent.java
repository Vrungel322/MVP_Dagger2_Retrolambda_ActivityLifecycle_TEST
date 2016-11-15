package com.nanddgroup.dagger_presenter_test.di;

import com.nanddgroup.dagger_presenter_test.Activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Nikita on 01.11.2016.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);
}
