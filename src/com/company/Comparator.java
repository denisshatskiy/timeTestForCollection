package com.company;

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

    public void CompareHashMapAndTreeMap(){
        HashMapExecutor hashMapExecutor= new HashMapExecutor();
        TreeMapExecuter treeMapExecuter= new TreeMapExecuter();

        System.out.println("\n\nBenchmarks for HashMap vs TreeMap : ");
        System.out.print("Add to : ");
        hashMapExecutor.HashMapAdd();
        System.out.print(" vs ");
        treeMapExecuter.TreeMapAdd();

        System.out.print("\nSearch in : ");
        hashMapExecutor.HashMapFounder();
        System.out.print(" vs ");
        treeMapExecuter.TreeMapFounder();

        System.out.print("\nDelete element : ");
        hashMapExecutor.HashMapDeleter();
        System.out.print(" vs ");
        treeMapExecuter.TreeMapDeleter();
    }
}