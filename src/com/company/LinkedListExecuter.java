package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Denis_Shatskiy on 11/6/2015.
 */
public class LinkedListExecuter {
        LinkedList LinkedList = new LinkedList();
        Random random = new Random();
        int size = 7000;
        int elementForSearch = 1545;

        public LinkedList LinkedList() {
            for (int i = 0; i < size; i++) {
                LinkedList.add(random.nextInt(size));

            }
            return LinkedList;
        }

        public LinkedList LinkedListSearch() {
            for (int i = 0; i < size; i++) {
                if (LinkedList.get(i).equals(elementForSearch)) {
                    System.out.println(elementForSearch + " is located in [" + i + "] place in LinkedList");
                }
            }
            return LinkedList;
        }

        public LinkedList LinkedListDelete() {
            Iterator<Integer> iter = LinkedList.iterator();
            while (iter.hasNext()) {
                int element = iter.next();
                if (element == elementForSearch) {
                    iter.remove();
                }
            }
            System.out.println(elementForSearch + " was deleted from LinkedList");

            return LinkedList;
        }
}


