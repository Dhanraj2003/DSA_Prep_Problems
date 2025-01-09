package array_based_prob;

import java.util.Scanner;

public class MaxConsecutivesOnes {

    public static void maxConsegativeOnes(int[] a)
    {
        int count=0;
        int maxCount=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                count++;
                if(count>maxCount)
                {
                    maxCount=count;
                }
            }
            else{
                count=0;
            }
        }

        System.out.println("MaxConsecutive Ones in given array is:"+maxCount);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of given array:");
        int size=sc.nextInt();

        int a[]=new int[size];

        System.out.println("Enter the elements into the array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        maxConsegativeOnes(a);


    }
}
