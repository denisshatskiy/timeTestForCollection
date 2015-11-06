package com.company;

/**
 * Created by Denis_Shatskiy on 11/6/2015.
 */
public class Benchmarks {
    private static long time;
    public static void startBenchMark(){
        time = System.currentTimeMillis();
    }

    public static void stopBenchMark(){
        time = System.currentTimeMillis() - time;
        System.out.println("Time = " + time + " mc");
    }
}
