package com.epam;

import com.epam.collections.*;

public class Comparator {
    public void compareArrayListAndLinkedList(){
        ListArrayExecutor listArrayExecutor = new ListArrayExecutor();
        LinkedListExecutor linkedListExecutor = new LinkedListExecutor();

        System.out.println("Benchmarks for ArrayList vs LinkedList : ");
        System.out.print("Add to         : ");
        System.out.print("difference = "  + (listArrayExecutor.getTimeOfAddOperationProcessing() - linkedListExecutor.getTimeOfAddOperationProcessing()) + " mc");

        System.out.print("\nSearch in      : ");
        System.out.print("difference = "  + (listArrayExecutor.getTimeOfSearchOperationProcessing() - linkedListExecutor.getTimeOfSearchOperationProcessing()) + " mc");

        System.out.print("\nDelete element : ");
        System.out.print("difference = "  + (listArrayExecutor.getTimeOfDeleteOperationProcessing() - linkedListExecutor.getTimeOfDeleteOperationProcessing()) + " mc");
    }

    public void compareHashSetAndTreeSet(){
        HashSetExecutor hashSetExecutor = new HashSetExecutor();
        TreeSetExecutor treeSetExecutor = new TreeSetExecutor();

        System.out.println("\n\nBenchmarks for HashSet vs TreeSet : ");
        System.out.print("Add to         : ");
        System.out.print("difference = "  + (hashSetExecutor.getTimeOfAddOperationProcessing() - treeSetExecutor.getTimeOfAddOperationProcessing()) + " mc");

        System.out.print("\nSearch in      : ");
        System.out.print("difference = "  + (hashSetExecutor.getTimeOfSearchOperationProcessing() - treeSetExecutor.getTimeOfSearchOperationProcessing()) + " mc");

        System.out.print("\nDelete element : ");
        System.out.print("difference = "  + (hashSetExecutor.getTimeOfDeleteOperationProcessing() - treeSetExecutor.getTimeOfDeleteOperationProcessing()) + " mc");
    }

    public void compareHashMapAndTreeMap(){
        HashMapExecutor hashMapExecutor= new HashMapExecutor();
        TreeMapExecutor treeMapExecutor = new TreeMapExecutor();

        System.out.println("\n\nBenchmarks for HashMap vs TreeMap :  ");
        System.out.print("Add to         : ");
        System.out.print("difference = "  + (hashMapExecutor.getTimeOfAddOperationProcessing() - treeMapExecutor.getTimeOfAddOperationProcessing()) + " mc");

        System.out.print("\nSearch in      : ");
        System.out.print("difference = "  + (hashMapExecutor.getTimeOfSearchOperationProcessing() - treeMapExecutor.getTimeOfSearchOperationProcessing()) + " mc");

        System.out.print("\nDelete element : ");
        System.out.print("difference = "  + (hashMapExecutor.getTimeOfDeleteOperationProcessing() - treeMapExecutor.getTimeOfDeleteOperationProcessing()) + " mc");
    }
}