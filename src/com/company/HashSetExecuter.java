package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashSetExecuter {
    HashSet HashSet = new HashSet();
    Random random = new Random();
    private int size = 7000;
    private int  elementForSearch = 1549;

    public HashSet HashSetAdd() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) {
            HashSet.add(random.nextInt(size));
        }
        Benchmarks.stopBenchMark();
        return HashSet;

    }

    public void HashSetFounder(){
        Benchmarks.startBenchMark();
        Iterator<Integer> iter = HashSet.iterator();
        while (iter.hasNext()) {
            int element = iter.next();
            if (element == elementForSearch) {
                break;
            }
        }
        Benchmarks.stopBenchMark();
    }

    public void HashSetDeleter(){
        Benchmarks.startBenchMark();
        Iterator<Integer> iter = HashSet.iterator();
        while (iter.hasNext()) {
            int element= iter.next();
            if (element == elementForSearch){
                iter.remove();
            }
        }
        Benchmarks.stopBenchMark();
    }
}
