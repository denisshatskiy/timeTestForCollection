package com.company;

import java.util.*;

public class HashMapExecutor {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    Random random = new Random();
    private int size = 7000;
    private int  elementForSearch = 1549;

    public HashMap HashMapAdd() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++){
            hashMap.put(i,random.nextInt());
        }
        Benchmarks.stopBenchMark();
        return hashMap;
    }

    public void HashMapFounder(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) {
            hashMap.get(i);
        }
        Benchmarks.stopBenchMark();
    }

    public void HashMapDeleter(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) {
            if (hashMap.get(i) == elementForSearch) {
                hashMap.remove(i);
            }
        }
        Benchmarks.stopBenchMark();
    }
}
