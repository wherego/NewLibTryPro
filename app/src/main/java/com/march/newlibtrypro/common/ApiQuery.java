package com.march.newlibtrypro.common;

import com.march.newlibtrypro.BaseSubsribe;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * com.march.newlibtrypro.common
 * Created by chendong on 16/7/18.
 * desc :
 */
public class ApiQuery {

    public static <T> Subscription query(Observable<T> obs, BaseSubsribe<T> subsribe) {
        return obs.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subsribe);
    }
}
