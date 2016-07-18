package com.march.newlibtrypro.ui.component;
import android.app.Activity;

import com.march.newlibtrypro.ActivityScope;
import com.march.newlibtrypro.BaseActivity;
import com.march.newlibtrypro.ui.activity.MainActivity;
import com.march.newlibtrypro.ui.module.MainModule;
import com.march.newlibtrypro.ui.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * com.march.newlibtrypro.ui.component
 * Created by chendong on 16/7/18.
 * desc :
 */
@ActivityScope
@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
    void inject(SecondActivity activity);
    MainPresenter getMainPresenter();
}
