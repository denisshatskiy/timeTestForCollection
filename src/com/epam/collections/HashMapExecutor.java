package com.epam.collections;

import com.epam.Benchmarks;

import java.util.*;

public class HashMapExecutor {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    private int size = 7000;
    public long time;

    public void hashMapAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) hashMap.put(i,i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void hashMapSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) hashMap.get(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void hashMapDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) hashMap.remove(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }
}
