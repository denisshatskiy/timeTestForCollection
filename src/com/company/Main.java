package com.company;

public class Main {

    public static void main(String[] args) {
        ListArrayExecuter listArrayExecuter = new ListArrayExecuter();
        LinkedListExecuter linkedListExecuter = new LinkedListExecuter();

        System.out.println("Benchmarks for ArrayListAdd : ");
        listArrayExecuter.ArrayListAdd();
        listArrayExecuter.ArrayFounder();
        listArrayExecuter.ArrayDeleter();

        System.out.println("\nBenchmarks for LinkedListFounder : ");
        linkedListExecuter.LinkedListAdd();
        linkedListExecuter.LinkedListFounder();
        linkedListExecuter.LinkedListDeleter();
    }
}
