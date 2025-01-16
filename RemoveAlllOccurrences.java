package array_based_prob;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAlllOccurrences {

    public static int[] removeElements(int[] a,int key)
    {
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=key)
            {
                a[index++]=a[i];

            }
        }

        return Arrays.copyOf(a,index);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[]a=new int[size];

        System.out.println("enter the elements into array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter any element to remove its occurence:");
        int k = sc.nextInt();

        a = removeElements(a, k);

        for(int i:a)
        {
            System.out.print(i+" ");
        }

    }
}
