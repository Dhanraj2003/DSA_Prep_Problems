package array_based_prob;

import java.util.Scanner;

public class PrintAlternateNumber {

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

        System.out.println("Alternate elements of array are:");
        for (int i=0;i<a.length;i=i+2)
        {
            System.out.println(a[i]);
        }

    }
}
