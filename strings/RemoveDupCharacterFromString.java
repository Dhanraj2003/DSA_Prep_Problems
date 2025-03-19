package string_based_programs;

import java.util.Scanner;

public class RemoveDupCharacterFromString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();

        boolean[] seen=new boolean[256];

        StringBuilder newStr=new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char currentChar=str.charAt(i);

            if(!seen[currentChar])
            {
                newStr.append(currentChar);
                seen[currentChar]=true;
            }
        }

        String string = newStr.toString();

        System.out.println("After removing dupliacte character from given string:"+string);

    }
}
