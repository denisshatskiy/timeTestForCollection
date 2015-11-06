package com.company;

import java.util.ArrayList;

/**
 * Created by Denis_Shatskiy on 11/6/2015.
 */
public class FillListArray {
    public ArrayList ArrayList() {
        ArrayList arrayList = new ArrayList();
        int size = 7000000;
        for (int i = 0; i < size; i++) {
            arrayList.add(Math.random());
        }
        return arrayList;
    }

}
