package com.nanddgroup.dagger_presenter_test.di;

import android.content.Context;

import com.nanddgroup.dagger_presenter_test.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nikita on 01.11.2016.
 */

//if u need to include sub-modules
//@Module(includes = {DataModule.class, DbModule.class})
@Module
public class ApplicationModule {
    private final App app;

    public ApplicationModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return app;
    }
}
