package com.march.newlibtrypro.data;

import com.march.newlibtrypro.BaseSubsribe;

import rx.Subscription;

/**
 * com.march.newlibtrypro.dragger
 * Created by chendong on 16/7/16.
 * desc :
 */
public abstract class BaseQuery<T> {
    ApiService api;

    public BaseQuery(ApiService api) {
        this.api = api;
    }

    public abstract <T>Subscription query(BaseSubsribe<T> subsribe);
}
