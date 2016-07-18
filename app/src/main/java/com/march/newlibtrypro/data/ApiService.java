package com.march.newlibtrypro.data;

import com.march.newlibtrypro.model.WeatherResultBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;

/**
 * com.march.newlibtrypro.dragger
 * Created by chendong on 16/7/16.
 * desc :
 */
public interface ApiService {
    @GET("apistore/weatherservice/cityname")
    Observable<WeatherResultBean> queryWeather(@Header("apikey") String apikey, @Query("cityname") String cityname);
}
