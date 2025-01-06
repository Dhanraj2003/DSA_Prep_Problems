package array_based_prob;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {

    public  static int[] removeDuplicatesFromSortedArray(int[] a)
    {
        int n = a.length;
        if (n == 0 || n == 1) {
            return a;
        }

        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[n-1];

        int[] result = Arrays.copyOf(temp, j);
        return result;
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

        int[] result =removeDuplicatesFromSortedArray(a);

        for(int i:result)
        {
            System.out.print(i+" ");
        }

    }
}
