package com.cainiao.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cainiao.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by tliang on 2017/8/9.
 * 功能描述：自定义actionBar
 */

public class ActionBar extends LinearLayout {
    @BindView(R.id.title)
    TextView title;//标题
    @BindView(R.id.action_bar_back)
    ImageView actionBarBack;//返回
    @BindView(R.id.action_bar_left)
    TextView actionBarLeft;//返回
    @BindView(R.id.action_bar_right)
    TextView actionBarRight;//菜单
    @BindView(R.id.action_bar_menu)
    ImageView actionBarMenu;//菜单
    @BindView(R.id.action_bar)
    FrameLayout actionBar;//actionBar
    private View view;

    public ActionBar(Context context) {
        super(context);
    }

    public ActionBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ActionBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        view = View.inflate(context, R.layout.action_bar, this);
    }

    @OnClick({R.id.action_bar_back, R.id.action_bar_left, R.id.action_bar_right, R.id.action_bar_menu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.action_bar_back:

                break;
            case R.id.action_bar_left:
                break;
            case R.id.action_bar_right:
                break;
            case R.id.action_bar_menu:
                break;
        }
    }

    /**
     * 是否显示和隐藏actionBar
     * @param visibility
     */
    public void setActionBarVisibility(int visibility){
        actionBar.setVisibility(visibility);
    }
    /**
     * 设置背景颜色
     * @param color
     */
    public void setActionBarBackgroundColor(int color){
        actionBar.setBackgroundColor(color);
    }

    /**
     * 设置标题
     * @param text
     */
    public void setTitle(CharSequence text){
        title.setText(text);
    }

    /**
     * 这是标题字体大小
     * @param size
     */
    public void setTitleSize(float size){
        title.setTextSize(size);
    }
    /**
     * 这是标题字体颜色
     * @param color
     */
    public void setTitleColor(int color){
        title.setTextColor(color);
    }

    /**
     * 设置actionbar 左边文字
     * @param text
     */
    public void setActionBarLeft(CharSequence text){
        actionBarLeft.setText(text);
    }

    /**
     * 这是actionbar 左边字体大小
     * @param size
     */
    public void setActionBarLeftSize(float size){
        actionBarLeft.setTextSize(size);
    }

    /**
     * 这是actionbar 左边字体颜色
     * @param color
     */
    public void setActionBarLeftColor(int color){
        actionBarLeft.setTextColor(color);
    }

    /**
     * 是否显示actionbar 左边文字
     * @param visibility
     */
    public void setActionBarLeftVisibility(int visibility){
        actionBarLeft.setVisibility(visibility);
    }

    /**
     * 设置actionbar 右边文字
     * @param text
     */
    public void setActionBarRight(CharSequence text){
        actionBarRight.setText(text);
    }

    /**
     * 这是actionbar 右边字体大小
     * @param size
     */
    public void setActionBarRightSize(float size){
        actionBarRight.setTextSize(size);
    }

    /**
     * 这是actionbar 右边字体颜色
     * @param color
     */
    public void setActionBarRightColor(int color){
        actionBarRight.setTextColor(color);
    }

    /**
     * 是否显示actionbar 右边文字
     * @param visibility
     */
    public void setActionBarRightVisibility(int visibility){
        actionBarRight.setVisibility(visibility);
    }

    /**
     * 设置返回键背景图片
     * @param backgroundResource
     */
    public void setActionBarBackBackgroundResource(int backgroundResource){
        actionBarBack.setBackgroundResource(backgroundResource);
    }

    /**
     * 是否显示返回键
     * @param visibility
     */
    public void setActionBarBackVisibility(int visibility){
        actionBarBack.setVisibility(visibility);
    }

    /**
     * 设置返回键背景图片
     * @param backgroundResource
     */
    public void setActionBarMenuBackgroundResource(int backgroundResource){
        actionBarMenu.setBackgroundResource(backgroundResource);
    }

    /**
     * 是否显示菜单
     * @param visibility
     */
    public void setActionBarMenuVisibility(int visibility){
        actionBarMenu.setVisibility(visibility);
    }

}
