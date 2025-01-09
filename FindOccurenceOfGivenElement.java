package array_based_prob;

import java.util.Scanner;

public class FindOccurenceOfGivenElement {

    public static int findOccurence(int[] a,int number)
    {
        int occurenceCount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==number)
            {
                occurenceCount++;
            }
        }

        return occurenceCount;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the elements into array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter any number for finding occurence:");
        int number=sc.nextInt();

        int occurenceResult = findOccurence(a, number);
        System.out.println("The Occurence of given number is:"+occurenceResult);
    }
}
