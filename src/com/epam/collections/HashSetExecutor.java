package com.epam.collections;

import com.epam.Benchmarks;

import java.util.HashSet;

public class HashSetExecutor {
    HashSet hashSet = new HashSet();
    private int size = 7000;
    public long time;

    public void  hashSetAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) hashSet.add(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void hashSetSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < hashSet.size(); i++)
            if (hashSet.equals(i));
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void hashSetDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < hashSet.size(); i++) hashSet.remove(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }
}
