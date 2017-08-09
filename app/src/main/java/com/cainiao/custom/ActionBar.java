package com.cainiao.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by tliang on 2017/8/9.
 * 功能描述：自定义actionBar
 */

public class ActionBar extends LinearLayout {
    public ActionBar(Context context) {
        super(context);
    }

    public ActionBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ActionBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
