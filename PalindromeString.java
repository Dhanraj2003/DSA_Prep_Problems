package string_based_programs;

import java.util.Scanner;

public class PalindromeString {

    public static void checkStringPalindrome(String s)
    {
        String resultString="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);

            resultString=ch+resultString;
        }

        if(s.equals(resultString))
        {
            System.out.println("The string is palindrome!!!");
        }else{
            System.out.println("The string is not palindrome!!!");
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string:");
        String s=sc.next();

        checkStringPalindrome(s);
    }
}
