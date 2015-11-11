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
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void arrayListSearchElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < arrayList.size(); i++) arrayList.get(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }

    public void arrayListDeleteElement(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < arrayList.size(); i++ ) arrayList.remove(i);
        Benchmarks.stopBenchMark();
        Benchmarks.printBenchmark();
        time = Benchmarks.stopBenchMark();
    }
}
