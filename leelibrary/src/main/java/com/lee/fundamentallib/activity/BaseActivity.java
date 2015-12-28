package com.lee.fundamentallib.activity;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2015/12/15 0015.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVariables();
        initViews(savedInstanceState);
        loadDate();

    }

    /**
     * initialize the variables and the variables from intent.
     */
    protected abstract void initVariables();

    /**
     * load the layout files,initialize the control component which will be
     * set event or callback function.
     */
    protected abstract void initViews(Bundle savedInstanceState);

    /**
     * fetch data by network.
     *
     */
    protected abstract void loadDate();


    /**
     * it initializes that's released when the activity pauses.*/
    protected abstract void initResume();

    /**
     * 1. Stop animations or other ongoing actions that could consume CPU.
     * 2. Commit unsaved changes, but only if users expect such changes to be
     * permanently saved when they leave (such as a draft email).
     * 3. Release system resources, such as broadcast receivers, handles to sensors (like GPS),
     * or any resources that may affect battery life while your activity is paused and the user does not need them.
     */
    protected abstract void releasePause();

    protected abstract void savePause();

    protected abstract void initStart();

    protected abstract void releaseStop();

    /**
     * you should use onStop() to perform larger, more CPU intensive shut-down operations,
     * such as writing information to a database.
     */
    protected abstract void saveStop();

    protected abstract void releaseDestroy();



}
