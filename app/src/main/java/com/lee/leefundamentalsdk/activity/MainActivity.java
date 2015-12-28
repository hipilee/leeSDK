package com.lee.leefundamentalsdk.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.gson.Gson;
import com.lee.leefundamentalsdk.R;
import com.lee.leefundamentalsdk.entity.JsonObject;
import com.lee.leefundamentalsdk.entity.Son;

import org.json.JSONObject;

public class MainActivity extends Activity {

    Button tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Error", "MainActivity onCreaet");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Error", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Error", "MainActivity onResume");
        int[] a = new int[3];
        a[0]=3;
        a[1]=4;
        a[2]=5;
        JsonObject jsonObject = new JsonObject("lee",27,a);
        String jsonString = testGsonFromObjectToJson(jsonObject);
        Log.e("Error", "Gson convertion finishes");
    }

    private String testGsonFromObjectToJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    private Son testGsonFromJsonToObject(String jsonStr) {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr,Son.class);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Error", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Error", "MainActivity onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Error", "MainActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Error", "MainActivity onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
