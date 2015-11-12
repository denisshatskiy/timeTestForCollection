package com.epam;

public class Benchmarks {
    private static long startTime;
    private static long totalTime;

    public static void startBenchMark(){
        startTime = System.currentTimeMillis();
    }

    public static long returnTotalTimeOfBenchmark(){
        totalTime = System.currentTimeMillis() - startTime;
        return totalTime;
    }

    public  static  void printBenchmark(){
        System.out.print(totalTime + " mc | ");
    }
}
