package array_based_prob;

import java.util.Scanner;

public class MoveAllZeroesToEnd {

    public static int[] moveAllZerosToEnd(int[] a)
    {
        int n=a.length;
        int[] temp=new int[n];
        int first=0;
        int last=n-1;

        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
               temp[last]=a[i];
               last--;
            }else{
                temp[first]=a[i];
                first++;
            }
        }
        return temp;
    }


    public static void main(String[] args) {

//        int[] a={1,2,0,4,3,0,5,0};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the elements into array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Before MoveAllZeroesToEnd array should be:");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        int[] result = moveAllZerosToEnd(a);

        System.out.println(" ");
        System.out.println("After MoveAllZeroesToEnd array will be:");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
