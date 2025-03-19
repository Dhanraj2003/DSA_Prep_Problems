package string_based_programs;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any string value:");
        String input=sc.nextLine();
        int vowels=0;int consonants=0;

        for(int i=0;i<input.length();i++)
        {

            char ch=input.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);


    }
}
