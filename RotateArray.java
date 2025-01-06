package array_based_prob;

import java.util.Scanner;

public class RotateArray {

    public static int[] rotateArray(int[] a)
    {
       int temp=a[a.length-1];

       for(int i=a.length-1;i>0;i--)
       {
           a[i]=a[i-1];
       }
       a[0]=temp;

       return a;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
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
