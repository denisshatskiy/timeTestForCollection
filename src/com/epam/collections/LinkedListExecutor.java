package com.epam.collections;

import com.epam.Benchmarks;

import java.util.LinkedList;

public class LinkedListExecutor {
    LinkedList linkedList = new LinkedList();
    private int size = 7000;
    public long time;

    public long linkedListAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) linkedList.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long linkedListSearchElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < linkedList.size(); i++) linkedList.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long linkedListDeleteElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < linkedList.size(); i++) linkedList.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}


