package com.android.study.time;

import android.os.SystemClock;

public class TimeStampMain {

    public static void main(String[] args) {

        nanoCase();

        testCurrentThreadTimeMillis();
    }

    private static void nanoCase(){
        long milliTimeBegin = System.currentTimeMillis();
        long nanoTimeBegin = System.nanoTime();
        for (int i = 0; i < 200; i++){

        }
        long nanoDuration = System.nanoTime() - nanoTimeBegin;
        long milliDuration = System.currentTimeMillis() - milliTimeBegin;

        System.out.println("循环100次消耗的时间：nanoDuration=" + nanoDuration + "纳秒, milliDuration=" + milliDuration + "毫秒");
    }

    private static void testCurrentThreadTimeMillis(){
        new Thread(){
            @Override
            public void run() {
                System.out.println("currentThreadTimeMillis1=" + SystemClock.currentThreadTimeMillis());//currentThreadTimeMillis=0
                SystemClock.sleep(2000);
                System.out.println("currentThreadTimeMillis2=" + SystemClock.currentThreadTimeMillis());//currentThreadTimeMillis=0
            }
        }.start();
    }
}
