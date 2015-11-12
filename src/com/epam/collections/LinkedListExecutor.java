package com.epam.collections;

import com.epam.Benchmarks;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExecutor {
    List linkedList = new LinkedList();
    private int size = 7000;
    public long time;

    public long getTimeOfAddOperationProcessing() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) linkedList.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfSearchOperationProcessing() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < linkedList.size(); i++) linkedList.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfDeleteOperationProcessing() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < linkedList.size(); i++) linkedList.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}


