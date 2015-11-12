package com.epam.collections;

import com.epam.Benchmarks;
import com.epam.Main;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExecutor {
    Map<Integer, Integer> treeMap = new TreeMap<>();
    private int size = 7000;
    public long time;

    public long getTimeOfAddOperationProcessing() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.put(i,i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfSearchOperationProcessing(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfDeleteOperationProcessing(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
