package com.epam.collections;

import com.epam.Benchmarks;

import java.util.TreeSet;

public class TreeSetExecutor {
    TreeSet treeSet = new TreeSet();
    private int size = 7000;
    public long time;

    public long treeSetAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) treeSet.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long treeSetSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < treeSet.size(); i++)
            if (treeSet.equals(i));
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long treeSetDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < treeSet.size(); i++) treeSet.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
