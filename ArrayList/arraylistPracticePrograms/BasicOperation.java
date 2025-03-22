package collection.framework.java.arraylistPracticePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class BasicOperation {

    public static void main(String[] args) {

        //Basic Operation
        ArrayList<Integer> list=new ArrayList<>();

        //Adding elements
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        //accessing single elements
        Integer i = list.get(0);
        System.out.println(i);

        //accessing all elements
        System.out.println("List:"+list);

        //remove
        list.remove(4);
        System.out.println("After removing elment from list:"+list);

        //updating elements
        list.set(3,500);
        System.out.println("After updating list:"+list);

        //checking size
        int size = list.size();
        System.out.println("Size:"+size);

        //Iterating over an arrayList:

        //using for-each loop
        System.out.println("List traversing using for-each loop");
        for(int num:list)
        {
            System.out.println(num);
        }

        //using for loop
        System.out.println("List traversing using for loop");
        for(int i1=0;i1<list.size();i1++)
        {
            System.out.println(list.get(i1));
        }

        //Sorting arraylist:
        System.out.println();

        //"Sorting using collections.sort()-natural order"
        System.out.println("Sorting using collections.sort()-natural order");
        Collections.sort(list);
        System.out.println(list);

        //Using stream api:
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List:"+collect);

        //using lambda expression:
        list.sort((a,b)->a.compareTo(b));
        System.out.println("ascending order sorting using lambda expression:"+list);

        list.sort((a,b)->b.compareTo(a));
        System.out.println("descending order sorting using lambda expression:"+list);


        //Remove duplicates elements from arraylist:

        HashSet<Integer> uniqueElement=new HashSet<>(list);

        System.out.println("ArrayList with duplicates: " + list);
        list.clear();
        list.addAll(uniqueElement);

        System.out.println("ArrayList without duplicates: " + list);

        //Reverse ArrayList:
        Collections.reverse(list);
        System.out.println("Reverse Arrylist:"+list);


        //find max and min

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

    }
}
