package com.march.newlibtrypro.ui.module;

import com.march.newlibtrypro.ui.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * com.march.newlibtrypro.ui.module
 * Created by chendong on 16/7/18.
 * desc :
 */
@Module
public class MainModule {

    MainPresenter.MainPresenterView viewPresenter;

    public MainModule(MainPresenter.MainPresenterView viewPresenter) {
        this.viewPresenter = viewPresenter;
    }

    @Provides
    @Singleton
    MainPresenter provideMainPresenter() {
        return new MainPresenter(viewPresenter);
    }

}
