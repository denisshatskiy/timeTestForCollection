package com.company;

public class Main {

    public static void main(String[] args) {
        ListArrayExecuter listArrayExecuter = new ListArrayExecuter();
        LinkedListExecuter linkedListExecuter = new LinkedListExecuter();
        new Benchmarks();

        System.out.println("Benchmarks for ArrayList : ");
        System.out.println("Add to : ");
        Benchmarks.startBenchMark();
        listArrayExecuter.ArrayList();
        Benchmarks.stopBenchMark();

        System.out.println("\nSearch : ");
        Benchmarks.startBenchMark();
        listArrayExecuter.ArraySearch();
        Benchmarks.stopBenchMark();

        System.out.println("\nRemove : ");
        Benchmarks.startBenchMark();
        listArrayExecuter.ArrayDelete();
        Benchmarks.stopBenchMark();

        System.out.println("\nBenchmarks for LinkedList : ");
        System.out.println("Add to : ");
        Benchmarks.startBenchMark();
        linkedListExecuter.LinkedList();
        Benchmarks.stopBenchMark();

        System.out.println("\nSearch : ");
        Benchmarks.startBenchMark();
        linkedListExecuter.LinkedListSearch();
        Benchmarks.stopBenchMark();

        System.out.println("\nRemove : ");
        Benchmarks.startBenchMark();
        linkedListExecuter.LinkedListDelete();
        Benchmarks.stopBenchMark();
    }
}
