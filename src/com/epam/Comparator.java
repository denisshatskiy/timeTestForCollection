package com.epam;

import com.epam.collections.*;

public class Comparator {
    public void compareArrayListAndLinkedList(){
        ListArrayExecutor listArrayExecutor = new ListArrayExecutor();
        LinkedListExecutor linkedListExecutor = new LinkedListExecutor();

        System.out.println("Benchmarks for ArrayList vs LinkedList : ");
        System.out.print("Add to         : ");
        System.out.print("difference = "  + (listArrayExecutor.arrayListAddElement() - linkedListExecutor.linkedListAddElement()) + " mc");

        System.out.print("\nSearch in      : ");
        System.out.print("difference = "  + (listArrayExecutor.arrayListSearchElement() - linkedListExecutor.linkedListSearchElement()) + " mc");

        System.out.print("\nDelete element : ");
        System.out.print("difference = "  + (listArrayExecutor.arrayListDeleteElement() - linkedListExecutor.linkedListDeleteElement()) + " mc");
    }

    public void compareHashSetAndTreeSet(){
        HashSetExecutor hashSetExecutor = new HashSetExecutor();
        TreeSetExecutor treeSetExecutor = new TreeSetExecutor();

        System.out.println("\n\nBenchmarks for HashSet vs TreeSet : ");
        System.out.print("Add to         : ");
        System.out.print("difference = "  + (hashSetExecutor.hashSetAddElement() - treeSetExecutor.treeSetAddElement()) + " mc");

        System.out.print("\nSearch in      : ");
        System.out.print("difference = "  + (hashSetExecutor.hashSetSearchElement() - treeSetExecutor.treeSetSearchElement()) + " mc");

        System.out.print("\nDelete element : ");
        System.out.print("difference = "  + (hashSetExecutor.hashSetDeleteElement() - treeSetExecutor.treeSetDeleteElement()) + " mc");
    }

    public void compareHashMapAndTreeMap(){
        HashMapExecutor hashMapExecutor= new HashMapExecutor();
        TreeMapExecutor treeMapExecutor = new TreeMapExecutor();

        System.out.println("\n\nBenchmarks for HashMap vs TreeMap :  ");
        System.out.print("Add to         : ");
        System.out.print("difference = "  + (hashMapExecutor.hashMapAddElement() - treeMapExecutor.treeMapAddElement()) + " mc");

        System.out.print("\nSearch in      : ");
        System.out.print("difference = "  + (hashMapExecutor.hashMapSearchElement() - treeMapExecutor.treeMapSearchElement()) + " mc");

        System.out.print("\nDelete element : ");
        System.out.print("difference = "  + (hashMapExecutor.hashMapDeleteElement() - treeMapExecutor.treMapDeleteElement()) + " mc");
    }
}