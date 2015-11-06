package com.company;

public class Benchmarks {
    private static long time;

    public static void startBenchMark(){
        time = System.currentTimeMillis();
    }

    public static void stopBenchMark(){
        time = System.currentTimeMillis() - time;
        System.out.print(time + " mc");
    }
}
