package com.cainiao.downloadlibrary.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tliang on 2017/8/17.
 * 功能描述：数据库帮助类
 */

public class DBHelper extends SQLiteOpenHelper{
    //数据库名字
    private static final String DB_NAME="download.db";
    //数据库初始化版本号
    private static final int VERSION=1;
    //创建表SQL语句
    private static final String SQL_CREATE="create table thread_info(_id integer primary key autoincrement, "
            + "thread_id integer, url text, start integer, end integer, finished integer)";
    //
    private static final String SQL_DROP="drop table if exists thread_info";
    private static DBHelper mDbHelper=null;

    public DBHelper(Context context) {
        super(context,DB_NAME,null,VERSION);
    }
    public static DBHelper getInstance(Context context){
        if (mDbHelper == null){
            mDbHelper=new DBHelper(context);
        }
        return mDbHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP);
        db.execSQL(SQL_CREATE);
    }
}
