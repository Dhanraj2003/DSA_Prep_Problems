package collection.framework.java.arraylistPracticePrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElementInList {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(19);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(3);
        list.add(39);
        list.add(20);

        Map<Integer,Integer> frequencyMap=new HashMap<>();

        for(int num:list)
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        System.out.println(frequencyMap);


    }
}
