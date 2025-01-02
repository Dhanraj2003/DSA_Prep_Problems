package array_based_prob;

import java.util.Scanner;

public class ReverseArray {

    public void reverseArray(int[] a) {
        for (int i = a.length-1; i >=0; i--) {
            System.out.println(a[i]);
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
        ReverseArray obj=new ReverseArray();
        System.out.println("Reverse Array:");
        obj.reverseArray(a);



    }
}
