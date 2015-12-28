package com.lee.leefundamentalsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2015/12/15 0015.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Error","SecondActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Error", "SecondActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Error", "SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Error", "SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Error", "SecondActivity onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Error", "SecondActivity onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Error", "SecondActivity onDestroy");
    }
}
