package array_based_prob;

import java.util.Scanner;

public class DynamicPositionRotateArray {

    static Scanner sc=new Scanner(System.in);
    public static int[] rotateArray(int[] a)
    {
        int temp=a[a.length-1];
        System.out.println("Enter the number of position to rotate!!!");
        int size= sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i< arr.length;i++)
        {
            arr[i]=a[a.length-1-i];
        }

        int i1;
        for(i1=a.length-1;i1>=size;i1--)
        {
            a[i1]=a[i1-size];
        }
        for(int k=i1,x=arr.length-1;k>=0;k--)
        {
            a[k]=arr[x];
            x--;
        }


        return a;
    }

    public static void main(String[] args) {


        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] a=new int[5];
        System.out.println("Enter the elements in array:");

        for (int i=0;i< a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        int[] result = rotateArray(a);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(a[i]+" ");
        }




    }
}
