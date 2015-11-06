package com.company;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetExecuter {
    TreeSet TreeSet = new TreeSet();
    Random random = new Random();
    private int size = 7000;
    private int  elementForSearch = 1549;

    public TreeSet TreeSetAdd() {
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) {
            TreeSet.add(random.nextInt(size));
        }
        Benchmarks.stopBenchMark();
        return TreeSet;

    }

    public void TreeSetFounder(){
        Benchmarks.startBenchMark();
        Iterator<Integer> iter = TreeSet.iterator();
        while (iter.hasNext()) {
            int element = iter.next();
            if (element == elementForSearch) {
                break;
            }
        }
        Benchmarks.stopBenchMark();
    }

    public void TreeSetDeleter(){
        Benchmarks.startBenchMark();
        Iterator<Integer> iter = TreeSet.iterator();
        while (iter.hasNext()) {
            int element= iter.next();
            if (element == elementForSearch){
                iter.remove();
            }
        }
        Benchmarks.stopBenchMark();
    }
}
