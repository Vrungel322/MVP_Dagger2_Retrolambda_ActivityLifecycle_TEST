package com.nanddgroup.dagger_presenter_test.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.nanddgroup.dagger_presenter_test.R;
import com.squareup.picasso.Picasso;

/**
 * Show lifecycle with restoring & saving data in rotate time (Instance)
 */
public class FullActivityLifecycle extends AppCompatActivity {
    ImageView ivLifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ivLifecycle = (ImageView) findViewById(R.id.ivLifecycle);
        if (savedInstanceState != null)
        Log.wtf("state : ", savedInstanceState.getString("S") + " from onCreate");
        Log.wtf("state : ", "onCreate");

//        Picasso.Builder builder = new Picasso.Builder(this);
//        builder.downloader(new OkHttpDownloader(this,Integer.MAX_VALUE));
//        Picasso built = builder.build();
//        built.setIndicatorsEnabled(true);
//        built.setLoggingEnabled(true);
//        Picasso.setSingletonInstance(built);
        Picasso.with(this).load("https://www.drupal.org/files/images/nodereference_url.png")
                .into(ivLifecycle);
        ivLifecycle.setOnClickListener(view -> {

        });
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
