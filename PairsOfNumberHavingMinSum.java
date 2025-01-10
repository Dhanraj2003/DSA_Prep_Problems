package array_based_prob;

import java.util.Scanner;

public class PairsOfNumberHavingMinSum {

    public static int[] findPairsOfNumHavingMinSum(int[] a)
    {
        int min=Integer.MAX_VALUE;
        int pair[]=new int[2];
        int second_min=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==min)
            {
                second_min=min;
            }else if(a[i]<min)
            {
                second_min=min;
                min=a[i];
            }else if(a[i]<second_min)
            {
                second_min=a[i];
            }
        }
        pair[0]=min;
        pair[1]=second_min;



        return pair;
    }



    public static void main(String[] args) {

//        int[] a={1,2,41,20,12,3};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] a=new int[size];
        System.out.println("Enter the elements into array:");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


        int[] pairsOfNumHavingMinSum = findPairsOfNumHavingMinSum(a);

        int sum=0;
        for(int i:pairsOfNumHavingMinSum)
        {
            sum=sum+i;
        }
        System.out.println("Sum:"+sum);

    }
}
