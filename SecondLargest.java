package Java_Array_Practical_Problems;

import java.util.Arrays;

public class SecondLargest {

    public static int secondLargest(int[] a,int largestEle,int secondLargestEle)
    {
        if(a.length==1)
        {
            return a[0];
        }
        else if(a.length<=1)
        {
            return -1;
        }
        else{
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>largestEle)
                {
                    secondLargestEle=largestEle;
                    largestEle=a[i];
                }
                else if(a[i]>secondLargestEle)
                {
                    secondLargestEle=a[i];
                }
            }
            return secondLargestEle;
        }
    }


    public static void main(String[] args) {

        int[] a={12,35,1,10,34,1};
       // int [] x={10};

        //find second largest element

        int large=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        int result = SecondLargest.secondLargest(a, large, secondLargest);

        if(result!=-1)
        {
            System.out.println("Largest element of array is:"+result);
            System.out.println("Second Largest element of array is:"+result);
        }
        else{
            System.out.println("Array is empty!!!");
        }
    }
}
