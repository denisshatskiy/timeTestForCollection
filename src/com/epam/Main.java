package com.epam;

public class Main {

    public static void main(String[] args) {
        Comparator comparator = new Comparator();

        comparator.compareArrayListAndLinkedList();
        comparator.compareHashSetAndTreeSet();
        comparator.compareHashMapAndTreeMap();
    }
}
