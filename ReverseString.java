package string_based_programs;

import java.util.Scanner;

public class ReverseString {

    public static void reverseString(String s)
    {
        String resultString="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);

            resultString=ch+resultString;
        }

        System.out.println(resultString);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string:");
        String s=sc.next();

        reverseString(s);
    }
}
