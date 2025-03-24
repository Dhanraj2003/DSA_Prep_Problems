package collection.framework.java.linkedlistPracticePrograms;

import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");


        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

