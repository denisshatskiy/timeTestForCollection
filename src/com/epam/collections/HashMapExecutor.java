package com.epam.collections;

import com.epam.Benchmarks;

import java.util.*;

public class HashMapExecutor {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    private int size = 7000;
    public long time;

    public long hashMapAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) hashMap.put(i,i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long hashMapSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) hashMap.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long hashMapDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) hashMap.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
