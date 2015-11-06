package com.company;

public class Main {

    public static void main(String[] args) {
        FillListArray fillListArray = new FillListArray();
        FillLinkedList fillLinkedList = new FillLinkedList();
        new Benchmarks();

        System.out.println("Benchmark for ArrayList : ");
        Benchmarks.startBenchMark();
        fillListArray.ArrayList();
        Benchmarks.stopBenchMark();

        System.out.println("Benchmark for LinkedList: ");
        Benchmarks.startBenchMark();
        fillLinkedList.LinkedList();
        Benchmarks.stopBenchMark();
    }
}
