package collection.framework.java.arraylistPracticePrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromList {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(19);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(3);
        list.add(39);

        Set<Integer> uniqueElement=new HashSet<>(list);

        list.clear();

        list.addAll(uniqueElement);

        System.out.println("After Removing duplicates elements from list:"+list);



    }
}
