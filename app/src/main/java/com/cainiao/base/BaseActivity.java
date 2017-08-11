package com.cainiao.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.cainiao.R;
import com.cainiao.custom.ActionBar;

import butterknife.ButterKnife;

/**
 * Created by tliang on 2017/8/9.
 * 功能描述：基类
 */
public abstract class BaseActivity extends FragmentActivity {
    protected Context context;
    private ActionBar actionBar;
    private View rootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        rootView=getView();
        ButterKnife.bind(this);
        LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        actionBar=new ActionBar(this);
        setContentView(rootView);
        ((ViewGroup)rootView).addView(actionBar,0,layoutParams);
    }

    public abstract View getView();
}
