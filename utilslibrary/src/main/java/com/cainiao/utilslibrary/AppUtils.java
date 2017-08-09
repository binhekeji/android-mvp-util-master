package com.cainiao.utilslibrary;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * Created by tliang on 2017/8/9.
 * 功能描述：
 */

public class AppUtils {
    /**
     * 是否开启日志
     * @param context
     * @return true 开启  false 不开启
     */
    public static boolean logger(Context context){
        try {
            ApplicationInfo applicationInfo=context.getPackageManager().
                    getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            boolean logger=applicationInfo.metaData.getBoolean("logger",false);
            return logger;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
