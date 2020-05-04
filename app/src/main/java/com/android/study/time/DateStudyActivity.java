package com.android.study.time;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import com.android.study.R;

/**
 * Time 的用法
 *  1) time = new Time();
 *  2) 设置时间 time.set(System.currentTime())
 *      设置时间这个函数将会，计算当前日期的具体细节，如：年、月、日、小时、分钟等
 *  3）获取年、月、日、小时、分钟等日期细节
 *  int thenYear = time.year;
 *  int thenMonth = time.month;
 *  int thenMonthDay = time.monthDay;
 *  int thenHour = time.hour;
 *  int thenMinute = time.minute;
 *  int thenSecond = time.second;
 */

public class DateStudyActivity extends Activity {
    private static final String TG = "vz-DateStudyActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_study);
        final Time time = new Time();
        time.setToNow();
        printTime(time);
        Log.e(TG, "onCreate " + Time.getCurrentTimezone());
        findViewById(R.id.btn_refresh_timezone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TG, "onClick " + Time.getCurrentTimezone());
                time.switchTimezone(Time.getCurrentTimezone());
                printTime(time);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void printTime(Time time) {
        if (time == null) {
            return;
        }
        int thenYear = time.year;
        int thenMonth = time.month;
        int thenMonthDay = time.monthDay;
        int thenHour = time.hour;
        int thenMinute = time.minute;
        int thenSecond = time.second;

        Log.i(TG, "------------ " + time + " ------------");
        Log.i(TG, thenYear + "-" + thenMonth + "-" + thenMonthDay
                + " " + thenHour + ":" + thenMinute + ":" + thenSecond);
    }
}
