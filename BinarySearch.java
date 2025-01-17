package array_based_prob;

import java.util.Scanner;

//binary search :
//time complexity:
//best case:O(1)
//avergae case:O(log n)
//worst case:O(log n)
public class BinarySearch {

    public static int[] sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }


    public static int binarySearch(int[] a,int target)
    {
        int left=0;
        int right=a.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;

            if(a[mid]==target)
            {
                return mid;
            }
            if(a[mid]>target)
            {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
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

        System.out.println("Enter the search element:");
        int target=sc.nextInt();

        int[] sortArray = sort(a);

        int i = binarySearch(sortArray, target);

        if(i!=-1)
        {
            System.out.println("Value "+target+" is fount at index "+i);
        }else{
            System.out.println("Value "+target+" is not fount ");
        }

    }
}
