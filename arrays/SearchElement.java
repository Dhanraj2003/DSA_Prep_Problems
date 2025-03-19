package array_based_prob;

import java.util.Scanner;

public class SearchElement {

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

        System.out.println("Enter the element which is to be search:");
        int searchElement=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==searchElement)
            {
                System.out.println("Search element is present at index "+i);
            }
        }
    }
}
