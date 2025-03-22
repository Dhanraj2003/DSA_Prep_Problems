package collection.framework.java.arraylistPracticePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxElementFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(19);
        list.add(20);
        list.add(10);
        list.add(3);
        list.add(39);

        Integer max = Collections.max(list);

        System.out.println("Max element:"+max);
    }
}
