package com.epam.collections;

import com.epam.Benchmarks;

import java.util.ArrayList;
import java.util.List;

public class ListArrayExecutor {
    List arrayList = new ArrayList();
    private int size = 7000;
    public long time;

    public long getTimeOfAddOperationProcessing() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) arrayList.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfSearchOperationProcessing(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < arrayList.size(); i++) arrayList.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfDeleteOperationProcessing(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < arrayList.size(); i++ ) arrayList.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
