package com.android.study.time;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import com.android.study.R;

public class SystemClockActivity extends Activity {
    private static final String TG = "vz-SystemClockActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_clock);
        findViewById(R.id.btn_currentThreadTimeMillis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {

                    @Override
                    public void run() {
                        //currentThreadTimeMillis=0
                        try {
                            Log.i(TG, "currentThreadTimeMillis1=" + SystemClock.currentThreadTimeMillis());
                            Thread.sleep(20000);//20ms
                            Log.i(TG, "currentThreadTimeMillis2=" + SystemClock.currentThreadTimeMillis());//currentThreadTimeMillis=1
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }.start();
            }
        });

    }
}
