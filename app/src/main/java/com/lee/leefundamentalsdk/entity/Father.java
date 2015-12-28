package com.lee.leefundamentalsdk.entity;

import android.util.Log;

/**
 * Created by Administrator on 2015/12/22 0022.
 */
public abstract class Father {
    public Father() {
        Log.e("ERROR","Father constructor");
    }

    public void run(){
        Log.e("error","father run");
        jump();
    }

    public abstract void jump();
}
