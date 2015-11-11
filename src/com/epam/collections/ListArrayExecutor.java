package com.epam.collections;

import com.epam.Benchmarks;

import java.util.ArrayList;

public class ListArrayExecutor {
    ArrayList arrayList = new ArrayList();
    private int size = 7000;
    public long time;

    public void arrayListAddElement() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) arrayList.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();

    }

    public void arrayListSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < arrayList.size(); i++) arrayList.get(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
    }

    public void arrayListDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < arrayList.size(); i++ ) arrayList.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
    }
}