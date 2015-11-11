package com.epam.collections;

import com.epam.Benchmarks;

import java.util.TreeSet;

public class TreeSetExecutor {
    TreeSet treeSet = new TreeSet();
    private int size = 7000;
    public long time;

    public void treeSetAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) treeSet.add(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void treeSetSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < treeSet.size(); i++)
            if (treeSet.equals(i));
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void treeSetDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < treeSet.size(); i++) treeSet.remove(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }
}
