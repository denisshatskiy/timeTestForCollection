package com.epam.collections;

import com.epam.Benchmarks;

import java.util.TreeMap;

public class TreeMapExecutor {
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    private int size = 7000;
    public long time;

    public long treeMapAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.put(i,i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long treeMapSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long treMapDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
