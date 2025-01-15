package array_based_prob;

import java.util.Scanner;

public class IncrementAllElementsOfArrayByOne {

    public static void incrementArrayElementByOne(int[] a)
    {

        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]+1;
        }

        System.out.println("Array After increment by 1:");
        for(int i:a)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] a=new int[size];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


        incrementArrayElementByOne(a);


    }
}
