package com.epam;

public class Benchmarks {
    private static long time;
    public static long timeTotal;

    public static void startBenchMark(){
        time = System.currentTimeMillis();
    }

    public static long returnTotalTimeOfBenchmark(){
        timeTotal = System.currentTimeMillis() - time;
        return timeTotal;
    }

    public  static  void printBenchmark(){
        System.out.print(timeTotal + " mc ");
    }
}
