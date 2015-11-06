package com.company;

import java.util.LinkedList;

/**
 * Created by Denis_Shatskiy on 11/6/2015.
 */
public class FillLinkedList {
   public LinkedList LinkedList(){
        LinkedList linkedList = new LinkedList();
        int size = 7000000;
        for (int i = 0; i < size; i++) {
            linkedList.add(Math.random());
        }
        return linkedList;
    }
}
