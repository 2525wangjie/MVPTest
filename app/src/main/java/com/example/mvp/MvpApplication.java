package com.example.mvp;

import android.app.Application;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;

public class MvpApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkHttpFinalConfiguration.Builder builder=new OkHttpFinalConfiguration.Builder();
        OkHttpFinal.getInstance().init(builder.build());
    }
}
