package array_based_prob;

import java.util.Scanner;

public class LeaderElement {

    public static void main(String[] args) {

//        int[] a={16,17,4,3,5,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] a=new int[size];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int flag=0;

        System.out.println("Leader element in given array is:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    flag=1;
                }
                else{
                    if(flag>=1)
                    {
                        flag=0;
                    }
                    break;
                }
            }
            if(flag>=1)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
