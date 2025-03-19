package array_based_prob;

import java.util.Scanner;

public class FindMissingValue {

    public static int findMissingValue(int[] a)
    {
        int n=a.length;
        int expectedSum=n*(n+1)/2;
        int sum=0;

        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        int actualSum=sum;

        int missingNum=expectedSum-actualSum;

        return missingNum;


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


        int missingValue = findMissingValue(a);
        System.out.println("Missing value of given array is:"+missingValue);


    }
}
