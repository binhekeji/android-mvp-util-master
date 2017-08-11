package com.cainiao.base;

import android.app.Application;
import android.content.Context;

import com.cainiao.BuildConfig;
import com.cainiao.utilslibrary.AppUtils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.LogStrategy;
import com.orhanobut.logger.LogcatLogStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import butterknife.ButterKnife;


/**
 * Created by tliang on 2017/8/9.
 * 功能描述：全局变量
 */

public class MyApplication extends Application {
    protected Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        initLogger();
        ButterKnife.bind(getApplicationContext());
    }

    /**
     * 初始化日志打印
     */
    private void initLogger(){
        FormatStrategy formatStrategy= PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)
                .methodCount(3)
                .methodOffset(5)
                .tag("logger")
                .logStrategy(new LogcatLogStrategy())
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, String tag) {
                return AppUtils.logger(getApplicationContext());
            }
        });
    }
}
