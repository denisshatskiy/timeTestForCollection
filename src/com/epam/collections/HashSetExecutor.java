package com.epam.collections;
import com.epam.Benchmarks;
import java.util.HashSet;
import java.util.Set;

public class HashSetExecutor {
    int size = 7000;
    Set<Integer> hashSet = new HashSet<>();
    public long time;

    public long getTimeOfAddOperationProcessing() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) hashSet.add(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfSearchOperationProcessing(){
        Benchmarks.startBenchMark();
        for (Integer i : hashSet) i.hashCode();
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }

    public long getTimeOfDeleteOperationProcessing(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < hashSet.size(); i++) hashSet.remove(i);
        time = Benchmarks.returnTotalTimeOfBenchmark();
        Benchmarks.printBenchmark();
        return time;
    }
}
