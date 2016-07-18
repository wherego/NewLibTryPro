package com.march.newlibtrypro.ui.presenter;

import android.telecom.Call;
import android.util.Log;
import android.view.View;

import com.march.newlibtrypro.BasePresenter;
import com.march.newlibtrypro.BaseSubsribe;
import com.march.newlibtrypro.PresenterView;
import com.march.newlibtrypro.common.ApiQuery;
import com.march.newlibtrypro.common.ConstantApi;
import com.march.newlibtrypro.model.WeatherResultBean;

import retrofit2.Callback;
import retrofit2.Response;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * com.march.newlibtrypro.ui.presenter
 * Created by chendong on 16/7/18.
 * desc :
 */
public class MainPresenter extends BasePresenter<MainPresenter.MainPresenterView> {

    public MainPresenter(MainPresenterView mPresenterView) {
        super(mPresenterView);
    }

    public interface MainPresenterView extends PresenterView {
        void changeDisplay(String txt);
    }

    public void request() {
        ApiQuery.query(mApiService.queryWeather(ConstantApi.baiduKey, "北京"),
                new BaseSubsribe<WeatherResultBean>() {
                    @Override
                    public void onSuccess(WeatherResultBean result) {
                        Log.e("chendong", result.toString());
                        mPresenterView.changeDisplay(result.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        Log.e("chendong", e.getMessage());
                    }
                });
//        subscribe.unsubscribe();
    }

}
