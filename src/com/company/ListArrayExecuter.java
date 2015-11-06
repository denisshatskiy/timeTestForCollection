package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListArrayExecuter {
    ArrayList arrayList = new ArrayList();
    Random random = new Random();
    private int size = 7000;
    private int  elementForSearch = 1549;

    public ArrayList ArrayListAdd() {
        System.out.print("Add to : ");
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(size));
        }
        Benchmarks.stopBenchMark();
        return arrayList;

    }

    public void ArrayFounder(){
        System.out.print("Search : ");
        Benchmarks.startBenchMark();
        for (int i = 0; i < size; i++){
            arrayList.get(elementForSearch);
        }
        Benchmarks.stopBenchMark();
    }

    public void ArrayDeleter(){
        System.out.print("Remove : ");
        Benchmarks.startBenchMark();
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()) {
            int element= iter.next();
            if (element == elementForSearch){
                iter.remove();
            }
        }
        Benchmarks.stopBenchMark();
    }

}
