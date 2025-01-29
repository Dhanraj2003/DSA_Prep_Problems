package array_based_prob;

import java.util.Scanner;

public class AlternatePositiveAndNegative {

    public static int[] rearrangeArrayElements(int[] a)
    {
        int n=a.length;
        int[] temp=new int[n];
        int posind=0;
        int negind=1;

        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                temp[posind]=a[i];
                posind=posind+2;
            }else{
                temp[negind]=a[i];
                negind=negind+2;
            }
        }
        return temp;
    }


    public static void main(String[] args) {

        int[] a={1,2,3,-4,-1,4,-2};
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter the size of array:");
//        int size=sc.nextInt();
//
//        int[] a=new int[size];
//
//        System.out.println("Enter the elements into array:");
//        for(int i=0;i<a.length;i++)
//        {
//            a[i]=sc.nextInt();
//        }

        System.out.println("Before rearranging the array:");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        int[] result = rearrangeArrayElements(a);

        System.out.println(" ");
        System.out.println("After rearranging array:");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
