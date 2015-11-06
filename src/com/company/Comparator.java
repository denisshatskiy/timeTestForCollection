package com.company;

import java.util.ArrayList;

/**
 * Created by Denis_Shatskiy on 11/6/2015.
 */
public class Comparator {
    public void CompareArrayListAndLinkedList(){
        ListArrayExecuter listArrayExecuter = new ListArrayExecuter();
        LinkedListExecuter linkedListExecuter = new LinkedListExecuter();

        System.out.println("Benchmarks for ArrayList vs LinkedList : ");
        System.out.print("Add to : ");
        listArrayExecuter.ArrayListAdd();
        System.out.print(" vs ");
        linkedListExecuter.LinkedListAdd();

        System.out.print("\nSearch in : ");
        listArrayExecuter.ArrayFounder();
        System.out.print(" vs ");
        linkedListExecuter.LinkedListFounder();

        System.out.print("\nDelete element : ");
        listArrayExecuter.ArrayDeleter();
        System.out.print(" vs ");
        linkedListExecuter.LinkedListDeleter();
    }

    public void CompareHashSetAndTreeSet(){
        HashSetExecuter hashSetExecuter= new HashSetExecuter();
        TreeSetExecuter treeSetExecuter= new TreeSetExecuter();

        System.out.println("\n\nBenchmarks for HashSet vs TreeSet : ");
        System.out.print("Add to : ");
        hashSetExecuter.HashSetAdd();
        System.out.print(" vs ");
        treeSetExecuter.TreeSetAdd();

        System.out.print("\nSearch in : ");
        hashSetExecuter.HashSetFounder();
        System.out.print(" vs ");
        treeSetExecuter.TreeSetFounder();

        System.out.print("\nDelete element : ");
        hashSetExecuter.HashSetDeleter();
        System.out.print(" vs ");
        treeSetExecuter.TreeSetDeleter();
    }
}