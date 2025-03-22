package collection.framework.java.arraylistPracticePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestElement {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(19);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(3);
        list.add(39);

        //first arrange list elements in descending order
        list.sort((a,b)->b-a);

        System.out.println(list);

        //get elements in 1st index

        Integer i = list.get(1);

        System.out.println("Second Largest Element:"+i);
    }
}
