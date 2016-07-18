package com.march.newlibtrypro;

import com.march.newlibtrypro.data.ApiService;

/**
 * com.march.newlibtrypro
 * Created by chendong on 16/7/18.
 * desc :
 */
public class BasePresenter <PV extends PresenterView>{
    protected ApiService mApiService;
    protected PV mPresenterView;

    public BasePresenter(PV mPresenterView) {
        this.mPresenterView = mPresenterView;
        mApiService = App.get().getNetComponent().getApiService();
    }
}
