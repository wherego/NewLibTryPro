package com.march.newlibtrypro;
import android.app.Application;

import com.march.newlibtrypro.common.ConstantApi;
import com.march.newlibtrypro.data.AppModule;
import com.march.newlibtrypro.data.DaggerNetComponent;
import com.march.newlibtrypro.data.NetComponent;
import com.march.newlibtrypro.data.NetModule;


/**
 * com.march.newlibtrypro
 * Created by chendong on 16/7/16.
 * desc :
 */
public class App extends Application {
    private NetComponent mNetComponent;
    private static App mInst;
    @Override
    public void onCreate() {
        super.onCreate();
        mInst = this;
        setDaggerConfig();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public static App get() {
        return mInst;
    }

    /**
     * 初始化Dragger，DaggerAppComponent是自动生成，需要Rebuild
     */
    private void setDaggerConfig() {
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(ConstantApi.BaiduUrl))
                .build();
    }
}