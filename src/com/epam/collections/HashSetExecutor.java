package com.epam.collections;

import com.epam.Benchmarks;

import java.util.HashSet;

public class HashSetExecutor {
    HashSet hashSet = new HashSet();
    private int size = 7000;
    public long time;

    public long hashSetAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) hashSet.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long hashSetSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < hashSet.size(); i++)
            if (hashSet.equals(i));
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long hashSetDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < hashSet.size(); i++) hashSet.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
