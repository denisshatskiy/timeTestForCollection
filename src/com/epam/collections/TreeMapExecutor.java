package com.epam.collections;

import com.epam.Benchmarks;

import java.util.TreeMap;

public class TreeMapExecutor {
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    private int size = 7000;
    public long time;

    public void treeMapAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.put(i,i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void treeMapSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.get(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void treMapDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) treeMap.remove(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }
}
