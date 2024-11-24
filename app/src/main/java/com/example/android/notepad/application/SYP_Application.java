package com.example.android.notepad.application;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.example.android.notepad.util.SharedPreferenceUtil;


public class SYP_Application extends Application {

    private static Context context;
    private static String background="#ffffff";//背景颜色的十六进制值,默认为白色

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
        readBackground();
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        SYP_Application.context = context;
    }

    public static String getBackground() {
        return background;
    }

    public static void setBackground(String background) {
        SYP_Application.background = background;
    }

    /*
        读取配置文件中的背景颜色
         */
    public static void readBackground(){
        if(SharedPreferenceUtil.getDate("background")==null||SharedPreferenceUtil.getDate("background").equals("")){

        }
        else{
            background= SharedPreferenceUtil.getDate("background");
        }

    }

    /*
   读取配置文件中的背景颜色
  */
    public static void saveBackground(){
        SharedPreferenceUtil.CommitDate("background",background);
    }
}