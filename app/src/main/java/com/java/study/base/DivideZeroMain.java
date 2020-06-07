package com.java.study.base;

public class DivideZeroMain {

    public static void main(String[] args) {
        System.out.println("1.0/0=" + 1.0/0);
        System.out.println("-1.0/0=" + -1.0/0);
        double positiveInfinity = 1.0/0;
        double negativeInfinity = -1.0/0;
        System.out.println("(positiveInfinity==negativeInfinity)=" + (positiveInfinity==negativeInfinity));
        System.out.println();

        System.out.println("100.0/0=" + 100.0/0);
        System.out.println("-100.0/0=" + -100.0/0);
        System.out.println();

        System.out.println("0.0/0=" + 0.0/0);
        System.out.println("(-0.0==0.0)=" + (-0.0==0.0));

    }

    /**
     * 速度换算 米/秒
     * @param distance 距离，单位米
     * @param time 时间，单位秒
     */
    float computeSpeed(float distance, long time){
        return distance/time;
    }
}
