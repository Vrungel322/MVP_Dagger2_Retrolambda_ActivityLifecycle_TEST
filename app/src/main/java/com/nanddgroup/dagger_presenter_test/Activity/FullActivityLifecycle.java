package com.nanddgroup.dagger_presenter_test.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.nanddgroup.dagger_presenter_test.R;

/**
 * Show lifecycle with restoring & saving data in rotate time (Instance)
 */
public class FullActivityLifecycle extends AppCompatActivity {
    TextView tvLifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvLifecycle = (TextView) findViewById(R.id.tvLifecycle);
        if (savedInstanceState != null)
        Log.wtf("state : ", savedInstanceState.getString("S") + " from onCreate");
        Log.wtf("state : ", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("state : ", "onStart");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.wtf("state : ", savedInstanceState.getString("S") + " from onRestoreInstanceState");
        Log.wtf("state : ", "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("state : ", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("state : ", "onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("S", "save");
        super.onSaveInstanceState(outState);
        Log.wtf("state : ", "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("state : ", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("state : ", "onDestroy");
    }
}
