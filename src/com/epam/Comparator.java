package com.epam;

import com.epam.collections.*;

public class Comparator {
    public void compareArrayListAndLinkedList(){
        ListArrayExecutor listArrayExecutor = new ListArrayExecutor();
        LinkedListExecutor linkedListExecutor = new LinkedListExecutor();

        System.out.println("Benchmarks for ArrayList vs LinkedList : ");
        System.out.print("Add to         : ");
        listArrayExecutor.arrayListAddElement();
        System.out.print(" vs ");
        linkedListExecutor.linkedListAddElement();
        System.out.print(" difference = "  + (listArrayExecutor.time - linkedListExecutor.time) + " mc");

        System.out.print("\nSearch in      : ");
        listArrayExecutor.arrayListSearchElement();
        System.out.print(" vs ");
        linkedListExecutor.linkedListSearchElement();
        System.out.print(" difference = "  + (listArrayExecutor.time - linkedListExecutor.time) + " mc");

        System.out.print("\nDelete element : ");
        listArrayExecutor.arrayListDeleteElement();
        System.out.print(" vs ");
        linkedListExecutor.linkedListDeleteElement();
        System.out.print(" difference = "  + (listArrayExecutor.time - linkedListExecutor.time) + " mc");
    }

    public void compareHashSetAndTreeSet(){
        HashSetExecutor hashSetExecutor = new HashSetExecutor();
        TreeSetExecutor treeSetExecutor = new TreeSetExecutor();

        System.out.println("\n\nBenchmarks for HashSet vs TreeSet : ");
        System.out.print("Add to         : ");
        hashSetExecutor.hashSetAddElement();
        System.out.print(" vs ");
        treeSetExecutor.treeSetAddElement();
        System.out.print(" difference = "  + (hashSetExecutor.time - treeSetExecutor.time) + " mc");

        System.out.print("\nSearch in      : ");
        hashSetExecutor.hashSetSearchElement();
        System.out.print(" vs ");
        treeSetExecutor.treeSetSearchElement();
        System.out.print(" difference = "  + (hashSetExecutor.time - treeSetExecutor.time) + " mc");

        System.out.print("\nDelete element : ");
        hashSetExecutor.hashSetDeleteElement();
        System.out.print(" vs ");
        treeSetExecutor.treeSetDeleteElement();
        System.out.print(" difference = "  + (hashSetExecutor.time - treeSetExecutor.time) + " mc");
    }

    public void compareHashMapAndTreeMap(){
        HashMapExecutor hashMapExecutor= new HashMapExecutor();
        TreeMapExecutor treeMapExecutor = new TreeMapExecutor();

        System.out.println("\n\nBenchmarks for HashMap vs TreeMap :  ");
        System.out.print("Add to         : ");
        hashMapExecutor.hashMapAddElement();
        System.out.print(" vs ");
        treeMapExecutor.treeMapAddElement();
        System.out.print(" difference = "  + (hashMapExecutor.time - treeMapExecutor.time) + " mc");

        System.out.print("\nSearch in      : ");
        hashMapExecutor.hashMapSearchElement();
        System.out.print(" vs ");
        treeMapExecutor.treeMapSearchElement();
        System.out.print(" difference = "  + (hashMapExecutor.time - treeMapExecutor.time) + " mc");

        System.out.print("\nDelete element : ");
        hashMapExecutor.hashMapDeleteElement();
        System.out.print(" vs ");
        treeMapExecutor.treMapDeleteElement();
        System.out.print(" difference = "  + (hashMapExecutor.time - treeMapExecutor.time) + " mc");
    }
}