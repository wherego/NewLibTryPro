package com.march.newlibtrypro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * com.march.newlibtrypro
 * Created by chendong on 16/7/18.
 * desc :
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}