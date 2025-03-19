package array_based_prob;

import java.util.Scanner;

public class CheckArraySortedOrNot {

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

        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j]) //a[i]<=a[j] && a[i]>=a[i-1]
                {
                    flag=flag+1;
                }
            }
        }
        if(flag>=1)
        {
            System.out.println("Given array is not sorted!!!");
        }
        else{
            System.out.println("Given array is sorted!!!");
        }
    }
}
