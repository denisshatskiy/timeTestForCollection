package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListExecuter {
    LinkedList LinkedList = new LinkedList();
    Random random = new Random();
    private int size = 7000;
    private int elementForSearch = 1545;

    public LinkedList LinkedListAdd() {
        System.out.print("Add to : ");
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) {
            LinkedList.add(random.nextInt(size));
        }
        Benchmarks.stopBenchMark();
        return LinkedList;

    }

    public void LinkedListFounder() {
        System.out.print("Search : ");
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) {
            LinkedList.get(elementForSearch);
        }
        Benchmarks.stopBenchMark();
    }

    public void LinkedListDeleter() {
        System.out.print("Remove : ");
        Benchmarks.startBenchMark();
        Iterator<Integer> iter = LinkedList.iterator();
        while (iter.hasNext()) {
            int element = iter.next();
            if (element == elementForSearch) {
                iter.remove();
            }
        }
        Benchmarks.stopBenchMark();
    }
}


