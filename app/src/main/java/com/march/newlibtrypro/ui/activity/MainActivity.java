package com.march.newlibtrypro.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.march.newlibtrypro.BaseActivity;
import com.march.newlibtrypro.R;
import com.march.newlibtrypro.ui.component.DaggerMainComponent;
import com.march.newlibtrypro.ui.component.MainComponent;
import com.march.newlibtrypro.ui.module.MainModule;
import com.march.newlibtrypro.ui.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<MainPresenter> implements MainPresenter.MainPresenterView {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (TextView) findViewById(R.id.tv);
        mPresenter.request();
    }

    @Override
    protected void setupDaggerComponent() {
        MainComponent build = DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build();
        build.inject(this);
        mPresenter = build.getMainPresenter();
    }


    @Override
    public void changeDisplay(String rst) {
        mTv.setText(rst);
    }
}
