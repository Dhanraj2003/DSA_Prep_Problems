package collection.framework.java.arraylistPracticePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListOfString {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("mango");
        list.add("orange");

        Collections.sort(list);

        System.out.println("Sorted List:"+list);
    }
}
