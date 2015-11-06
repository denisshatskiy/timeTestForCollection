package com.company;

import java.util.Random;
import java.util.TreeMap;

public class TreeMapExecuter {
    TreeMap<Integer, Integer> TreeMap = new TreeMap<>();
    Random random = new Random();
    private int size = 7000;
    private int  elementForSearch = 1549;

    public TreeMap TreeMapAdd() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++){
            TreeMap.put(i,random.nextInt());
        }
        Benchmarks.stopBenchMark();
        return TreeMap;
    }

    public void TreeMapFounder(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) {
            TreeMap.get(i);
        }
        Benchmarks.stopBenchMark();
    }

    public void TreeMapDeleter(){
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i ++) {
            if (TreeMap.get(i) == elementForSearch) {
                TreeMap.remove(i);
            }
        }
        Benchmarks.stopBenchMark();
    }
}
