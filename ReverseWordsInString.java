package string_based_programs;


import java.util.Scanner;

public class ReverseWordsInString {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any string:");
        String str=sc.nextLine();

        //ex:String str="i like this programming very much";

        String temp="";
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                temp=str.charAt(i)+temp;
                if(i==0)
                {
                    System.out.print(temp);
                }
            }else{
                System.out.print(temp+" ");
                temp="";
            }
        }
    }
}
