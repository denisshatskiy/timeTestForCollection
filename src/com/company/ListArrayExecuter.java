package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Denis_Shatskiy on 11/6/2015.
 */
public class ListArrayExecuter {
    ArrayList arrayList = new ArrayList();
    Random random = new Random();
    int size = 7000;
    int  elementForSearch = 1549;

    public ArrayList ArrayList() {
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(size));

        }
        return arrayList;
    }

    public ArrayList ArraySearch(){
        for (int i = 0; i < size; i++){
            if (arrayList.get(i).equals(elementForSearch)) {
                System.out.println(elementForSearch + " is located in [" + i + "] place in Arraylist");
            }
        }
        return arrayList;
    }

    public ArrayList ArrayDelete(){
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()) {
            int element= iter.next();
            if (element == elementForSearch){
                iter.remove();
            }
        }
        System.out.println(elementForSearch + " was deleted from Arraylist");

        return arrayList;
    }

}
