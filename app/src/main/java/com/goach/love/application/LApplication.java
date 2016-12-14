package com.goach.love.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by 钟光新 on 2016/7/1 0001.
 */
public class LApplication extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
    public static Context  getInstance(){
        return mContext;
    }
}
