package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * reverse strings in the list
 */
public class task1_2listRevert {
    public static void main(String[ ] args)
    {
        List<String> arrayList= new ArrayList<String>();

        arrayList.add("element 1");
        arrayList.add("element 2");
        arrayList.add("element 3");
        arrayList.add("element 4");
        arrayList.add("element 5");
        arrayList.add("element 6");
        arrayList.add("element 7");
        arrayList.add("element 8");
        arrayList.add("element 9");

       for(int a = 0; a < arrayList.size()/2; a++){
           String tmp = arrayList.get(a);
           arrayList.set(a, arrayList.get(arrayList.size() -1-a));
           arrayList.set (arrayList.size()-1-a, tmp);
       }
        System.out.println( arrayList);
    }
}