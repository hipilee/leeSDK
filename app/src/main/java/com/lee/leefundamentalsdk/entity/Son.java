package com.lee.leefundamentalsdk.entity;

import android.app.Activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.lee.leefundamentalsdk.R;

/**
 * Created by Administrator on 2015/12/22 0022.
 */
public class Son extends Father {
    private Bitmap bitmap;
    private int a[] = new int[3];

    public Son(Activity activity) {

        Bitmap bmp = BitmapFactory.decodeResource(activity.getResources(), R.mipmap.ic_launcher);
        bitmap = bmp.copy(Bitmap.Config.RGB_565,true);
        a[0]=9;
        a[1]=10;
        a[2]=11;
        Log.e("ERROR","Son constructor");
    }

    @Override
    public void jump() {
        Log.e("ERROR","Son jump");
    }

    @Override
    public void run() {
        super.run();
        Log.e("ERROR", "Son run");
    }
}
