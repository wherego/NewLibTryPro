package com.march.newlibtrypro.data;

import com.march.newlibtrypro.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * com.march.newlibtrypro
 * Created by chendong on 16/7/16.
 * desc :提供app级别的实例
 */
@Module
public class AppModule {

    App mApp;

    public AppModule(App mApp) {
        this.mApp = mApp;
    }

    //提供application实例
    @Provides
    @Singleton
    App provideApp(){
        return mApp;
    }
}
