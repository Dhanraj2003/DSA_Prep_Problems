package string_based_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharacter {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string value:");
        String str=sc.nextLine();

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);

            map.put(currentChar,map.getOrDefault(currentChar,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicates character from given string is: "+entry.getKey());
            }
        }
    }
}
