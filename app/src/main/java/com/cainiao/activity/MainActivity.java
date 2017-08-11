package com.cainiao.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.cainiao.R;
import com.cainiao.base.BaseActivity;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tekjkj)
    TextView tekjkj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String json = "{\n" +
                "    \"name\": \"BeJson\",\n" +
                "    \"url\": \"http://www.bejson.com\",\n" +
                "    \"page\": 88,\n" +
                "    \"isNonProfit\": true,\n" +
                "    \"address\": {\n" +
                "        \"street\": \"科技园路.\",\n" +
                "        \"city\": \"江苏苏州\",\n" +
                "        \"country\": \"中国\"\n" +
                "    },\n" +
                "    \"links\": [\n" +
                "        {\n" +
                "            \"name\": \"Google\",\n" +
                "            \"url\": \"http://www.google.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Baidu\",\n" +
                "            \"url\": \"http://www.baidu.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"SoSo\",\n" +
                "            \"url\": \"http://www.SoSo.com\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        Logger.json(json);
        Logger.v("vvvvvvvv");
        Logger.d("dddddddd");
        Logger.e("eeeeeeee");
        Logger.w("wwwwwwww");
        Logger.v("vvvvvvvv");
        Logger.wtf("wtfwtf");

        Logger.xml("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<android.support.constraint.ConstraintLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:id=\"@+id/activity_main\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\"com.libin.multi.tools.MainActivity\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Hello World!\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"@+id/activity_main\"\n" +
                "        app:layout_constraintLeft_toLeftOf=\"@+id/activity_main\"\n" +
                "        app:layout_constraintRight_toRightOf=\"@+id/activity_main\"\n" +
                "        app:layout_constraintTop_toTopOf=\"@+id/activity_main\" />\n" +
                "    \n" +
                "    <ImageView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\" />\n" +
                "    \n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\" />\n" +
                "\n" +
                "</android.support.constraint.ConstraintLayout>\n");
    }
}
