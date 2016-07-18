package com.march.newlibtrypro.data;


import com.march.newlibtrypro.BasePresenter;
import com.march.newlibtrypro.PresenterView;

import javax.inject.Singleton;

import dagger.Component;

/**
 * com.march.newlibtrypro.dragger
 * Created by chendong on 16/7/16.
 * desc :
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    ApiService getApiService();
}
