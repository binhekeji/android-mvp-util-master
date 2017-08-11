package com.cainiao.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cainiao.R;

import butterknife.ButterKnife;

/**
 * Created by tliang on 2017/8/9.
 * 功能描述：基类
 */
public abstract class BaseFragment extends Fragment {

    protected View rootView;
    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ButterKnife.bind(this,rootView);
        return rootView;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
