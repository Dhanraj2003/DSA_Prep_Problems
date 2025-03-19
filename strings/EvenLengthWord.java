package string_based_programs;


import java.util.Scanner;

public class EvenLengthWord {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any string:");
        String str=sc.nextLine();


        System.out.println("Even length words are:");
        for(String s:str.split(" "))
        {
            if(s.length()%2==0)
            {
                System.out.println(s);
            }
        }




    }
}
