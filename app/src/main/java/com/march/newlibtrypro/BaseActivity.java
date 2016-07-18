package com.march.newlibtrypro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialog;

import com.march.newlibtrypro.ui.component.DaggerMainComponent;

import dagger.Module;

/**
 * com.march.newlibtrypro
 * Created by chendong on 16/7/18.
 * desc :
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupDaggerComponent();
    }

    protected abstract void setupDaggerComponent();

    protected  void destroyPresenter(){
        mPresenter = null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroyPresenter();
    }
}
