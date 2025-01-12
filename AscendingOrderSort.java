package array_based_prob;

import java.util.Scanner;

public class AscendingOrderSort {

    public static void ascendingOrderSort(int[] a)
    {
        int temp;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        printArray(a);
    }

    public static void printArray(int[] a)
    {
        System.out.println("After Ascending Sorting Array:");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
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

        System.out.println("Before Ascending Sorting Array:");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        ascendingOrderSort(a);

    }
}
