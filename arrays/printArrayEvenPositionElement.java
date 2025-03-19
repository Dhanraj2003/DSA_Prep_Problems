package array_based_prob;

import java.util.Scanner;

public class printArrayEvenPositionElement {

    public static void printEvenPositionElement(int[] a)
    {
        System.out.println("Even position elements are:");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(a[i]+" ");
            }
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
        printEvenPositionElement(a);
    }
}
