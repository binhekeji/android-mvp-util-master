package com.cainiao.base;

import android.app.Application;

import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.LogStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;


/**
 * Created by tliang on 2017/8/9.
 * 功能描述：全局变量
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    private void initLogger(){
//        FormatStrategy formatStrategy= PrettyFormatStrategy.newBuilder()
//                .showThreadInfo(false)
//                .methodCount(0)
//                .methodOffset(7)
//                .logStrategy()
    }
}
